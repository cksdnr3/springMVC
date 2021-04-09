package cu.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cu.board.domain.Board;
import cu.md.domain.Address;

@Repository
public interface BoardMapper {
	public List<Board> list();
	public void insert(Board board);
	public void delete(long seq);
	public void update(Board board);
	public Board detail(long seq);
}
