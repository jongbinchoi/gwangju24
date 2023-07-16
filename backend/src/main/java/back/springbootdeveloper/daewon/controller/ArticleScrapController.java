package back.springbootdeveloper.daewon.controller;

import back.springbootdeveloper.daewon.dto.articlescrap.ArticleScrapResponse;
import back.springbootdeveloper.daewon.service.ArticleScrapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 룸복 어노테이션
@RestController
public class ArticleScrapController {

    private final ArticleScrapService articleScrapService;

    // 클래스 만들때 생각
    // 게시판 3개
    // 클래스를 3개를 만들것인가
    // 아니면 클래스 하나에 메서드를 3개를 만들 것인가.
    @GetMapping("/article/scrap")
    public ResponseEntity<List<ArticleScrapResponse>> findAllArticles() {

        List<ArticleScrapResponse> articles = articleScrapService.findAll()
                .stream() // blogService에서 찾아온 Article의 하나하나가 파라미터로 넘어간다.
                .map(ArticleScrapResponse::new) // list -> articlescrapService new
                .toList();

        return ResponseEntity.ok().body(articles);
    }
}
