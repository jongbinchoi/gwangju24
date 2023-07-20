package back.springbootdeveloper.seungchan.dto;

import back.springbootdeveloper.seungchan.domain.Article;
import lombok.Builder;
import lombok.Getter;

@Getter
public class EachArticleResponseDTO {
    private final long id;
    private final String title;
    private final String author;
    private final String date;
    private final String content;

    @Builder
    public EachArticleResponseDTO(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.author = article.getAuthor();
        this.date = article.getDate();
        this.content = article.getContent();
    }
}