package cu.md.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cu.md.domain.Files;

@Repository
public interface FilesMapper {
	public List<Files> list();
	public void insert(Files file);
	public void delete(long seq);
	public void update(Files file);
	public Files detail(long seq);
}
