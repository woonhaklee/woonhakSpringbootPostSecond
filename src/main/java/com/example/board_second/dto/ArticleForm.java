package com.example.board_second.dto;

import com.example.board_second.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    // DTO
    // 템플릿에서 받은 데이터를 저장하는 곳
    // 받은 데이터를 컨트롤러로 연결시켜주는 곳

    private String title;
    private String content;

    // Generate - Constructor
    // public ArticleForm(String title, String content) {
    //    this.title = title;
    //    this.content = content;
    // }

    // 데이터가 잘 받아졌는지 확인하기 위한 toString
    // @Override
    // public String toString() {
    //     return "ArticleForm{" +
    //             "title='" + title + '\'' +
    //             ", content='" + content + '\'' +
    //             '}';
    // }

    public Article toEntity() {
        return  new Article(null, title, content);
    }
}
