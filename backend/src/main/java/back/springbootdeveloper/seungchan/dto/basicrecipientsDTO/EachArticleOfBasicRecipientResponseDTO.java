package back.springbootdeveloper.seungchan.dto.basicrecipientsDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Recipients;
import lombok.Builder;
import lombok.Getter;

@Getter
public class EachArticleOfBasicRecipientResponseDTO {
    private final long id;
    private final String title;
    private final String author;
    private final String date;
    private final String content;

    @Builder
    public EachArticleOfBasicRecipientResponseDTO(Recipients article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.author = article.getAuthor();
        this.date = article.getDate();
        this.content = article.getContent();
    }
}