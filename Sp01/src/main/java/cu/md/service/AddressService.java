package cu.md.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cu.md.domain.Address;
import cu.md.domain.Files;

public interface AddressService {
	List<Address> listS();
	ArrayList<Files> insertS(Address address, ArrayList<MultipartFile> files);
	void deleteS(long seq);
	public Address detail(long seq);
}
