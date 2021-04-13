package cu.md.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import cu.md.domain.Address;
import cu.md.domain.Files;
import cu.md.mapper.AddressMapper;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log
@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
	private AddressMapper mapper;
	private FileServiceImpl fileService;

	@Override
	public List<Address> listS() {
		return mapper.list();
	}

//	@Transactional
	@Override
	public ArrayList<Files> insertS(Address address, ArrayList<MultipartFile> files) {
		mapper.insert(address);
		
		long pk = address.getSeq();
		
		ArrayList<Files> uploadedFileList = new ArrayList<Files>();
		
		for (MultipartFile file : files) {
			String ofname = file.getOriginalFilename();
			if (ofname.length() > 0) uploadedFileList.add(fileService.saveStore(file, pk));
		}
		
		return uploadedFileList;
	}

	@Override
	public void deleteS(long seq) {
		mapper.delete(seq);
		
	}

	@Override
	public Address detail(long seq) {
		// TODO Auto-generated method stub
		return null;
	}

}
