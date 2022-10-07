package com.example.board_second.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 DTO에서 불러온 객체를 인식할 수 있게 선언
@AllArgsConstructor
@ToString
public class Article {

    @Id // 고유 아이디값 지정
    @GeneratedValue // 1,2,3.. 자동생성 선언될 수 있는 어노테이션
    private Long id;

    // 방법은 dto랑 똑같이 선언을 해주고
    // DB에서 해당 겍체를 인식할 수 있게 상단에 @Entity 선언
    @Column // DB에서 인식할 수 있는 컬럼타입으로 선언
    private String title;

    @Column
    private String content;

    // 생성자 추가
    // public Article(Long id, String title, String content) {
    //     this.id = id;
    //     this.title = title;
    //     this.content = content;
    // }

    // 생성자 추가 테스트
    // @Override
    // public String toString() {
    //     return "Article{" +
    //             "id=" + id +
    //             ", title='" + title + '\'' +
    //             ", content='" + content + '\'' +
    //             '}';
    // }
}
