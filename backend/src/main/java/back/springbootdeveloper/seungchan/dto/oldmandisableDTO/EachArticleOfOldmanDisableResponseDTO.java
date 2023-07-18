package back.springbootdeveloper.seungchan.dto.oldmandisableDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import lombok.Builder;
import lombok.Getter;

@Getter
public class EachArticleOfOldmanDisableResponseDTO {
    private final long id;
    private final String title;
    private final String author;
    private final String date;
    private final String content;

    @Builder
    public EachArticleOfOldmanDisableResponseDTO(OldmanDisables article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.author = article.getAuthor();
        this.date = article.getDate();
        this.content = article.getContent();
    }
}