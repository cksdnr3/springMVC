package cu.md.service;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cu.md.domain.Files;
import cu.md.filesetting.Path;
import cu.md.mapper.FilesMapper;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log
@Service
@AllArgsConstructor
public class FileServiceImpl implements FileService {
	private FilesMapper mapper;

	@Override
	public String saveStore(MultipartFile file) {
		String ofname = file.getOriginalFilename();
		int idx = ofname.lastIndexOf(".");
		String ofHeader = ofname.substring(0, idx);
		String ext = ofname.substring(idx);
		
		long ms = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ofHeader);
		sb.append("_");
		sb.append(ms);
		sb.append(ext);
		
		String saveFileName = sb.toString();
		
		long fsize = file.getSize();
		
		log.info("ofname: " + ofname + ", saveFileName: " + saveFileName + ", fsize: " + fsize);
		
		boolean flag = writeFile(file, saveFileName);
		
		if (flag) {
			log.info("upload success");
			Files f = new Files();
			f.setFsize(fsize);
			f.setOfname(ofname);
			f.setSfname(saveFileName);
			mapper.insert(f);
			
		} else {
			log.info("upload fail");
		}
		
		return Path.FILE_STORE + "\\" + saveFileName;
	}
	
	@Override
	public String saveStore(MultipartFile file, long fk) {
		String ofname = file.getOriginalFilename();
		int idx = ofname.lastIndexOf(".");
		String ofHeader = ofname.substring(0, idx);
		String ext = ofname.substring(idx);
		
		long ms = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ofHeader);
		sb.append("_");
		sb.append(ms);
		sb.append(ext);
		
		String saveFileName = sb.toString();
		
		long fsize = file.getSize();
		
		log.info("ofname: " + ofname + ", saveFileName: " + saveFileName + ", fsize: " + fsize);
		
		boolean flag = writeFile(file, saveFileName);
		
		if (flag) {
			log.info("upload success");
			Files f = new Files();
			f.setSeq(fk);
			f.setFsize(fsize);
			f.setOfname(ofname);
			f.setSfname(saveFileName);
			mapper.insert(f);
			
		} else {
			log.info("upload fail");
		}
		
		return Path.FILE_STORE + "\\" + saveFileName;
	}

	@Override
	public boolean writeFile(MultipartFile file, String filename) {
		File dir = new File(Path.FILE_STORE);
		
		if (!dir.exists()) dir.mkdirs(); // 깊은 depth dir 생성 가능
		
		FileOutputStream fos = null;
		
		try {
			byte data[] = file.getBytes();
			fos = new FileOutputStream(Path.FILE_STORE + "/" + filename);
			fos.write(data);
			fos.flush();
			
			return true;
		} catch(IOException ie) {
			return false;
		} finally {
			try {
				if (fos != null) fos.close();
			} catch(IOException ie) {}
		}
	}
}
