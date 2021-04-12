package cu.md.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Files {
	private long seqf;
	private String sfname;
	private String ofname;
	private long fsize;
	private long seq;
}
