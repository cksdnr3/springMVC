package cu.md.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private long seq;
	private String name;
	private String addr;
	private Date rdate;

	public Address(String name, String addr, Date rdate) {
		this.name = name;
		this.addr = addr;
		this.rdate = rdate;
	}
}
