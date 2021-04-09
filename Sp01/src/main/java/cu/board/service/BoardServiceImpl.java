package cu.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.board.domain.Board;
import cu.board.mapper.BoardMapper;
import cu.md.domain.Address;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper mapper;

	@Override
	public List<Board> list() {
		
		return mapper.list();
	}

	@Override
	public void insert(Board board) {
		mapper.insert(board);
	}

	@Override
	public void delete(long seq) {
		mapper.delete(seq);
	}

	@Override
	public void update(Board board) {
		mapper.update(board);
	}

	@Override
	public Board detail(long seq) {
		return mapper.detail(seq);
	}
}
