package com.suntime.study.dto;

import com.suntime.study.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long idx;
    private String memberEmail;
    private String memberPW;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setIdx(memberEntity.getIdx());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPW(memberEntity.getMemberPW());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}