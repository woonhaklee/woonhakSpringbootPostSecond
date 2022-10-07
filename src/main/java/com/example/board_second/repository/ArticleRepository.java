package com.example.board_second.repository;

import com.example.board_second.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
// 직접 코드설정을 하는게 아니라 CrudRepository를 이용해서 Repository를 관리
// CrudRepository< 엔티티 이름명, 대표타입 지정 >
}
