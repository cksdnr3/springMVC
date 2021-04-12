package cu.md.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cu.md.dao.AddressDao;
import cu.md.domain.Address;
import cu.md.mapper.AddressMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
	private AddressMapper mapper;
	private FileServiceImpl fileService;

	@Override
	public List<Address> listS() {
		return mapper.list();
	}

	@Override
	public void insertS(Address address, ArrayList<MultipartFile> files) {
		mapper.insert(address);
		
		for (MultipartFile file : files) {
			String ofname = file.getOriginalFilename();
			if (ofname.length() > 0) fileService.saveStore(file);
		}
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
