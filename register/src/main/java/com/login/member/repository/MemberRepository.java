package com.login.member.repository;

import com.login.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> { //Long은  Entity의 PK가 어떤 타입인지 적는다.
    // 이메일로 회원 정보 조회     (select * from member_table where member_email=?)
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
