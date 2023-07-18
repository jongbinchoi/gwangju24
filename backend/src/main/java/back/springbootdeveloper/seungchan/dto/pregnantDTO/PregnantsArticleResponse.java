package back.springbootdeveloper.seungchan.dto.pregnantDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import lombok.Getter;

@Getter
public class PregnantsArticleResponse {
    private final String title;
    private final long id;

    public PregnantsArticleResponse(Pregnants article) {
        this.title = article.getTitle();
        this.id = article.getId();
    }
}
