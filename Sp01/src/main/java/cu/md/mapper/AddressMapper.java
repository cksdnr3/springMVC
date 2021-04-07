package cu.md.mapper;

import java.util.List;

import cu.md.domain.Address;

public interface AddressMapper {
	public List<Address> list();
	public void insert(Address address);
	public void delete();
}
