package back.springbootdeveloper.seungchan.service.pregnantsService;

import back.springbootdeveloper.seungchan.domain.Article;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import back.springbootdeveloper.seungchan.domain.Recipients;
import back.springbootdeveloper.seungchan.service.ArticleService;
import back.springbootdeveloper.seungchan.util.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나  @NotNull이 붙는 필드의 생성자 추가
@Service  // 해당 클래스를 빈으로 서블릿 컨테이너에 등록
public class PregnantsService {
    private final ArticleService articleService;

    public Pregnants findById(long id) {
        List<Pregnants> list = articleService.getArticleOfPregnants();
        for (Pregnants article : list) {
            if (id == article.getId()) {
                return article;
            }
        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }
}
