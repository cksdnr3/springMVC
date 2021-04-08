package cu.md.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.md.dao.AddressDao;
import cu.md.domain.Address;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao addressDao;

	@Override
	public List<Address> listS() {
		return addressDao.list();
	}

	@Override
	public void insertS(Address address) {
		addressDao.insert(address);
	}

	@Override
	public void deleteS(long seq) {
		addressDao.delete(seq);
		
	}

}
