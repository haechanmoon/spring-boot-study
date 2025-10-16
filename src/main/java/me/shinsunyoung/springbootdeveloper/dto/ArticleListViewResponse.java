package me.shinsunyoung.springbootdeveloper.dto;

import lombok.Getter;
import me.shinsunyoung.springbootdeveloper.domain.Article;

@Getter //왜 Getter를 쓰는거지?
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article){ //domain에 있는 article은 뭐지?
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
