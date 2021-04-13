package cu.md.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cu.md.domain.Address;

@Repository
public interface AddressMapper {
	public List<Address> list();
	public long insert(Address address);
	public void delete(long seq);
	public Address detail(long seq);
}
