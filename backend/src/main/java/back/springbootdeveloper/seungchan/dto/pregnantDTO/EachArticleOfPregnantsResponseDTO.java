package back.springbootdeveloper.seungchan.dto.pregnantDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import lombok.Builder;
import lombok.Getter;

@Getter
public class EachArticleOfPregnantsResponseDTO {
    private final long id;
    private final String title;
    private final String author;
    private final String date;
    private final String content;

    @Builder
    public EachArticleOfPregnantsResponseDTO(Pregnants article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.author = article.getAuthor();
        this.date = article.getDate();
        this.content = article.getContent();
    }
}