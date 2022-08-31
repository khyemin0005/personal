package net.softsociety.personal.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.personal.domain.Board;
import net.softsociety.personal.domain.Reply;

@Mapper
public interface BoardDAO {

	public int writeBoard(Board board);

	public ArrayList<Board> selectAll();

	public Board selectOne(int boardnum);

	public int inputReply(Reply reply);

	public ArrayList<Reply> selectReply(int boardnum);

}
