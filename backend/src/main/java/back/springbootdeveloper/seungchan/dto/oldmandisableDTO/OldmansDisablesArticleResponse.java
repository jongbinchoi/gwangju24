package back.springbootdeveloper.seungchan.dto.oldmandisableDTO;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import lombok.Getter;

@Getter
public class OldmansDisablesArticleResponse {
    private final String title;
    private final long id;

    public OldmansDisablesArticleResponse(OldmanDisables article) {
        this.title = article.getTitle();
        this.id = article.getId();
    }
}
