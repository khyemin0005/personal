package net.softsociety.personal.service;

import java.util.ArrayList;

import net.softsociety.personal.domain.Board;
import net.softsociety.personal.domain.Reply;

public interface BoardService {

	// Board
	public int writeBoard(Board board);

	public ArrayList<Board> selectAll();

	public Board selectOne(int boardnum);

	// Reply
	public int inputReply(Reply reply);

	public ArrayList<Reply> selectReply(int boardnum);

	public int deleteBoard(Board board);

}
