package net.softsociety.personal.service;

import net.softsociety.personal.domain.Member;

public interface MemberService {

	public int insertMember(Member member);

	public Member getMemberInfo(String id); // ?

	public int countMemberid(String userid);

}
