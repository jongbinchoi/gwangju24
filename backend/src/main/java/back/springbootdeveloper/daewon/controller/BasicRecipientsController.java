package back.springbootdeveloper.daewon.controller;

import back.springbootdeveloper.daewon.domain.Article;
import back.springbootdeveloper.daewon.dto.basicrecipientsarticle.BasicRecipientsArticleResponse;
import back.springbootdeveloper.daewon.service.BasicRecipientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 룸복 어노테이션
@RestController
public class BasicRecipientsController {

    private final BasicRecipientsService basicRecipientsService;

    // 클래스 만들때 생각
    // 게시판 3개
    // 클래스를 3개를 만들것인가
    // 아니면 클래스 하나에 메서드를 3개를 만들 것인가.
    @GetMapping("/article/basic-recipients")
    // 글 전체를 조회 -> 응답용 객체인 ArticleResponse로 파싱 -> body에 담아 클라이언트에게 전송
    public ResponseEntity<List<BasicRecipientsArticleResponse>> findAllArticles() {
        // responseEntity -> List -> BasicRecipientsResponse

        List<BasicRecipientsArticleResponse> articles = basicRecipientsService.findAll()
                .stream()
                // blogService에서 찾아온 Article의 하나하나가 파라미터로 넘어간다.
                .map(BasicRecipientsArticleResponse::new) // list -> BasicRecipientsResponse new
                .toList();

        return ResponseEntity.ok().body(articles);
    }

    // TODO: MAKE /ARTICLE/BasicRecipients{ID}
    @GetMapping("/articles/basic-recipients/{id}")
    // @PathVariable 매너테이션은 URL에서 값을 가져오는 애너테이션
    // /api/articles/3 GET 요청을 받으면 id에 3이 들어온다.
    public ResponseEntity<BasicRecipientsArticleResponse> findArticle(@PathVariable long id) {
        Article article = basicRecipientsService.findById(id);
        return ResponseEntity.ok()
                .body(new BasicRecipientsArticleResponse(article));
    }
}
