package back.springbootdeveloper.daewon.controller;

import back.springbootdeveloper.daewon.domain.Article;
import back.springbootdeveloper.daewon.dto.oldmansdisables.OldmansDisablesArticleResponse;
import back.springbootdeveloper.daewon.service.OldmansDisablesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 룸복 어노테이션
@RestController
public class OldmansDisablesController {

    @Autowired
    private final OldmansDisablesService oldmansDisablesService;

    // 클래스 만들때 생각
    // 게시판 3개
    // 클래스를 3개를 만들것인가
    // 아니면 클래스 하나에 메서드를 3개를 만들 것인가.
    @GetMapping("/article/oldmans-disables")
    // 글 전체를 조회 -> 응답용 객체인 ArticleResponse로 파싱 -> body에 담아 클라이언트에게 전송
    public ResponseEntity<List<OldmansDisablesArticleResponse>> findAllArticles() {
        // responseEntity -> List -> OldmansDisablesArticleResponse
        List<OldmansDisablesArticleResponse> articles = oldmansDisablesService.findAll()
                .stream()
                // blogService에서 찾아온 Article의 하나하나가 파라미터로 넘어간다.
                .map(OldmansDisablesArticleResponse::new) // list -> OldmansDisablesArticleResponse new
                .toList();

        return ResponseEntity.ok().body(articles);
    }

    // TODO: MAKE /ARTICLE/OLDMANS-DISABLES/{ID}
    @GetMapping("/article/oldmans-disables/{id}")
    // @PathVariable 매너테이션은 URL에서 값을 가져오는 애너테이션
    // /api/articles/3 GET 요청을 받으면 id에 3이 들어온다.
    public ResponseEntity<OldmansDisablesArticleResponse> findArticle(@PathVariable long id) {
        Article article = oldmansDisablesService.findById(id);

        return ResponseEntity.ok()
                .body(new OldmansDisablesArticleResponse(article));
    }
}