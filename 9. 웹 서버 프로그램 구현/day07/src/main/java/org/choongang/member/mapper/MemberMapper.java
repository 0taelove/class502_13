package org.choongang.member.mapper;

import org.choongang.member.entities.Member;

// 구현체를 만들어줌
public interface MemberMapper {
    long exist(String email);
    Member get(String email);
    int register(Member member);

}