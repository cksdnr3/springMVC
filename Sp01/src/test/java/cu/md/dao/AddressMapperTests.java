package cu.md.dao;

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
	private AddressDao addressDao;
	
	@Test
	public void testList() {

//		log.info("#ADDRESS MAPPER: " + addressMapper);
//		log.info("#ADDRESSMAPPER LIST: " + addressMapper.list());
	}
	
	@Test
	public void testInsert() {
		Address address = new Address("hello", "mybatis", null);
		addressDao.insert(address);
		log.info("#ADRESSMAPPER INSERT: ");
	}
	
	@Test
	public void testDelete() {
		long seq = 17L;
		addressDao.delete(seq);
		log.info("#addressDaoTests delete() 수행 완료");
	}
}