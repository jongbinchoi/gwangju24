package back.springbootdeveloper.seungchan.dto.oldmandisableDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import lombok.Getter;

@Getter
public class OldmansDisablesArticleResponse {
    private final String title;
    private final long id;
    private final String author;
    private final String date;

    public OldmansDisablesArticleResponse(OldmanDisables article) {
        this.title = article.getTitle();
        this.id = article.getId();
        this.author = article.getAuthor();
        this.date = article.getDate();
    }
}
