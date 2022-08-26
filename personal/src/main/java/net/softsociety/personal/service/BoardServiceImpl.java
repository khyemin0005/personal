package net.softsociety.personal.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.softsociety.personal.dao.BoardDAO;
import net.softsociety.personal.domain.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public int writeBoard(Board board) {
		int result = boardDAO.writeBoard(board);
		return result;
	}

	@Override
	public ArrayList<Board> selectAll() {
		ArrayList<Board> list = boardDAO.selectAll();
		return list;
	}

}
