package net.softsociety.personal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.personal.domain.Board;
import net.softsociety.personal.domain.Reply;
import net.softsociety.personal.service.BoardService;

@Slf4j
@Controller
@RequestMapping("board")
public class BoardController {

	//첨부파일이 저장된 경로
//	@Value("${spring.servlet.multipart.location}")
//	String uploadPath;
	
	@Autowired
	BoardService service;
	
	@GetMapping("list")
	public String list(Model model) {
		
		ArrayList<Board> list = service.selectAll();
		
		model.addAttribute("list", list);
		
		return "/boardView/list";
	}
	
	@GetMapping("writeBoard")
	public String writeBoard() {
		return "/boardView/writeBoard";
	}
	
	@PostMapping("publish")
	public String publish(
			Board board
			, @AuthenticationPrincipal UserDetails user) {

		String id = user.getUsername();
		board.setUserid(id);
		
//		if(upload != null && !upload.isEmpty()) {
//			String savedfile = FileService.saveFile(upload, uploadPath);
//			board.setOriginalfile(upload.getOriginalFilename());
//			board.setSavedfile(savedfile);
//		}
		
		log.debug("Board: {}", board);
		
		service.writeBoard(board);
		
		return "redirect:list";
	}
	
	@GetMapping("read")
	public String read(Model model
			, @RequestParam(name="boardnum", defaultValue="0") int boardnum) {
		log.debug("Boardnum: {}", boardnum);
		
		Board board = service.selectOne(boardnum);
		log.debug("Board: {}", board);
		
		if(boardnum == 0) {
			return "redirect:/";
		}
		
		ArrayList<Reply> reply = service.selectReply(boardnum);
		
		model.addAttribute("board", board);
		model.addAttribute("reply", reply);
		
		return "/boardView/read";
	}
	
	
	@PostMapping("inputReply")
	public String inputReply(Reply reply
			, @AuthenticationPrincipal UserDetails user) {
		
		String id = user.getUsername();
		reply.setUserid(id);
		log.debug("ID: {}", id);
		
		log.debug("Reply: {}", reply);
		service.inputReply(reply);
		
		return "redirect:/boardView/read?boardnum=" + reply.getBoardnum();
	}
	
}
