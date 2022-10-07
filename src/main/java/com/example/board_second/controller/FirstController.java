package com.example.board_second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "LEEWOONHAK");
        return "greetings"; // Templates 폴더 안에서 동일 이름을 찾아서 브라우저로 전송/반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "LEEWOONHAK");
        return "goodbye";
    }
}