package com.suntime.study.controller;

import com.suntime.study.dto.MemberDTO;
import com.suntime.study.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "index";
    }

    @GetMapping("/index")
    public String loginForm(){
        return "index";
    }
    @PostMapping("/index")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO loginResult = memberService.login(memberDTO);
        if(loginResult != null){
            session.setAttribute("loginEmail",loginResult.getMemberEmail());
            // login 성공
            return "study";
        } else{
            // login 실패
            return "index";
        }
    }

}
