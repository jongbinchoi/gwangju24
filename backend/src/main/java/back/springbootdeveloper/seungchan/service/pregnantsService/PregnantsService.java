package back.springbootdeveloper.seungchan.service.pregnantsService;

import back.springbootdeveloper.seungchan.domain.Article;
import back.springbootdeveloper.seungchan.util.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나  @NotNull이 붙는 필드의 생성자 추가
@Service  // 해당 클래스를 빈으로 서블릿 컨테이너에 등록
public class PregnantsService {
    public Article findById(long id) {
        List<Article> list = Util.getTempList();

        for (Article article : list) {
            if (id == article.getId()) {
                return article;
            }
        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }
}
