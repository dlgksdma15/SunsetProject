package com.suntime.study.entity;

import com.suntime.study.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
// Entity란 실제 DB에 매칭되는 클래스를 의미한다
@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private long idx;

    @Column(unique = true)// unique 제약조건 추가
    private String memberEmail;

    @Column
    private String memberPW;

    @Column
    private String memberName;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberPW(memberDTO.getMemberPW());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }
}
