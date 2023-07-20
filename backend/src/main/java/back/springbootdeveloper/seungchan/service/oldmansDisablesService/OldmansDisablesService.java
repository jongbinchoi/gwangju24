package back.springbootdeveloper.seungchan.service.oldmansDisablesService;

import back.springbootdeveloper.seungchan.domain.Article;
import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor // final이 붙거나  @NotNull이 붙는 필드의 생성자 추가
@Service  // 해당 클래스를 빈으로 서블릿 컨테이너에 등록
public class OldmansDisablesService {
    private final ArticleService articleService;

    public OldmanDisables findOldmanDisableById(long id) {
        List<OldmanDisables> list = articleService.getArticleOfOldmanDisables();
        for (OldmanDisables article : list) {
            if (id == article.getId()) {
                return article;
            }
        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }

    public List<OldmanDisables> findAll() {
        return articleService.getArticleOfOldmanDisables();
    }
}
