package back.springbootdeveloper.seungchan.dto.basicrecipientsDTO;

import back.springbootdeveloper.seungchan.domain.Pregnants;
import back.springbootdeveloper.seungchan.domain.Recipients;
import lombok.Getter;

@Getter
public class BasicRecipientsArticleResponse {

    private final String title;
    private final long id;

    //    글은 제목과 내용 구성이므로
    //    해당 필드를 가지는 클래스를 만든 다음
    //    엔티티를 인수로 받는 생성자를 추가
    public BasicRecipientsArticleResponse(Recipients article) {
        this.title = article.getTitle();
        this.id = article.getId();
    }
}


