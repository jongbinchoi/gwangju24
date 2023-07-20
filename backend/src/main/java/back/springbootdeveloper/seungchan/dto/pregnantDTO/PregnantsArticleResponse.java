package back.springbootdeveloper.seungchan.dto.pregnantDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import lombok.Getter;

@Getter
public class PregnantsArticleResponse {
    private final String title;
    private final long id;
    private final String author;
    private final String date;

    public PregnantsArticleResponse(Pregnants article) {
        this.title = article.getTitle();
        this.id = article.getId();
        this.author = article.getAuthor();
        this.date = article.getDate();
    }
}
