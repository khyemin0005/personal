package net.softsociety.personal.service;

import java.util.ArrayList;

import net.softsociety.personal.domain.Board;

public interface BoardService {

	public int writeBoard(Board board);

	public ArrayList<Board> selectAll();

	public Board selectOne(int boardnum);

}
