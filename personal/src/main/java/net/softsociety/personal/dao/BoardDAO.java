package net.softsociety.personal.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.personal.domain.Board;

@Mapper
public interface BoardDAO {

	public int writeBoard(Board board);

	public ArrayList<Board> selectAll();

}
