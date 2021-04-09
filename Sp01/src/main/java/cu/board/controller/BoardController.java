package cu.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cu.board.domain.Board;
import cu.board.service.BoardServiceImpl;
import cu.md.domain.Address;

@RequestMapping("/board")
@Controller
public class BoardController {

	@Autowired
	private BoardServiceImpl service; 
	
	@GetMapping("/list.do")
	public ModelAndView list() {
		List<Board> list = service.list();
		
		ModelAndView mv = new ModelAndView("board/list", "list", list);
		
		return mv;
	}
	
	@GetMapping("/write.do")
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/write.do")
	public String write(Board board) {
		service.insert(board);
		return "redirect:list.do";
	}
	
	@GetMapping("/del.do")
	public String delete(long seq) {
		service.delete(seq);
		
		return "redirect:list.do";
	}
	
	@GetMapping("/update.do")
	public ModelAndView modify(long seq) {
		Board board = service.detail(seq);
		
		ModelAndView mv = new ModelAndView("board/update", "board", board);
		
		return mv;
	}
	
	@PostMapping("/update.do")
	public String modify(Board board) {
		service.update(board);
		
		return "redirect:list.do";
	}
	
	@GetMapping("/detail.do")
	public ModelAndView detail(long seq) {
		Board board = service.detail(seq);
		
		ModelAndView mv = new ModelAndView("board/content", "board", board);
		
		return mv;
	}
}
