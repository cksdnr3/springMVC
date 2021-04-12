package cu.md.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	String saveStore(MultipartFile file);
	String saveStore(MultipartFile file, long fk);
	boolean writeFile(MultipartFile file, String filename);
}
