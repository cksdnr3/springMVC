package cu.md.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTests {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try {
			log.info("####testDatasource: " + dataSource);
			
			Connection con = dataSource.getConnection();
			
			log.info("####connection: " + con);
		} catch(Exception e) {
			
		}
	}
}
