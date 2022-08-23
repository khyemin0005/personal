package net.softsociety.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.softsociety.personal.dao.MemberDAO;
import net.softsociety.personal.domain.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;

	@Override
	public int insertMember(Member member) {

		int result = memberDAO.insertMember(member);
		return result;
	}

	@Override
	public Member getMemberInfo(String id) {
		Member member = memberDAO.selectOne(id);
		return member;
	}
	
}
