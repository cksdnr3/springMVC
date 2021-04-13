package cu.md.service;

import org.springframework.web.multipart.MultipartFile;

import cu.md.domain.Files;

public interface FileService {
	String saveStore(MultipartFile file);
	Files saveStore(MultipartFile file, long fk);
	boolean writeFile(MultipartFile file, String filename);
}
