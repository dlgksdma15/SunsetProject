package com.suntime.study.controller;

import com.suntime.study.dto.PersonalDTO;
import com.suntime.study.service.PersonalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PersonalController {
    private final PersonalService personalService; // 수정

    @PostMapping("/personal/subject")
    public String subject(@ModelAttribute PersonalDTO personalDTO){
        System.err.println("personalDTO = " + personalDTO);
        personalService.save(personalDTO); // 수정
        return "index";
    }

    @GetMapping("/index")
    public String showPersonalForm(Model model) {
        // 서비스를 통해 데이터베이스에서 모든 개인 엔티티를 가져와서 모델에 추가합니다.
        model.addAttribute("subject_table", personalService.getAllExampleEntities());
        return "index";
    }

}
