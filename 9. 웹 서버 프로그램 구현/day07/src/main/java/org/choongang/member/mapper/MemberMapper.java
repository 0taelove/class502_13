package org.choongang.member.mapper;

import org.choongang.member.entities.Member;

public interface MemberMapper {
    // 구현체 만들어줌
    long exist(String email);
    Member get(String email);
    int register(Member member);
}
