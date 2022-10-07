package com.example.board_second.controller;

import com.example.board_second.dto.ArticleForm;
import com.example.board_second.entity.Article;
import com.example.board_second.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 골뱅이 (어노테이션)
public class ArticleController {

    @Autowired
    // 기존자바에서는 개체를 만들어줘어야하지만
    // Autowired를 사용해서 스프링부트가 미리 생성해놓은 객체를 가져다가 자동연경
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        // DTO에서 받아 온 데이터를 출력테스트
        // System.out.println(form.toString());
        // 실제 업무에서는 System.out.println을 사용하지않는다 -> 로깅기능으로 대체
        log.info(form.toString());

        // DTO는 자바, DataBase는 SQL 언어
        // DTO의 데이터를 DB에 저장하기 위해서는 중간에서 변환해주는 엔티티가 필요
        Article article = form.toEntity();
        // System.out.println(article.toString());
        log.info(article.toString());

        // 엔티티로 변환된 데이터를 DB에 저장하기 위해서는 Repository가 필요
        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
