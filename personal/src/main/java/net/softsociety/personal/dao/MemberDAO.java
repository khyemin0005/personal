package net.softsociety.personal.dao;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.personal.domain.Member;

@Mapper
public interface MemberDAO {

	public int insertMember(Member member);

	public Member selectOne(String id);

}
