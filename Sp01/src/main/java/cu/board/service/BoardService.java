package cu.board.service;

import java.util.List;

import cu.board.domain.Board;
import cu.md.domain.Address;

public interface BoardService {
	public List<Board> list();
	public void insert(Board board);
	public void delete(long seq);
	public void update(Board board);
	public Board detail(long seq);
}
