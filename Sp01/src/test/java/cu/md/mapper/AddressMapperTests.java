package cu.md.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cu.md.domain.Address;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AddressMapperTests {
	
	@Autowired
	private AddressMapper addressMapper;
	
	@Test
	public void testList() {

//		log.info("#ADDRESS MAPPER: " + addressMapper);
//		log.info("#ADDRESSMAPPER LIST: " + addressMapper.list());
	}
	
	@Test
	public void testInsert() {
		Address address = new Address("hello", "mybatis", null);
		addressMapper.insert(address);
		log.info("@!#!@#!@#!#@$!@#%#@$^@#$^@#ADRESSMAPPER INSERT: ");
	}
}
