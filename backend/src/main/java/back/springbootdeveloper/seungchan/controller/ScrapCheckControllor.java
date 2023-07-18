package back.springbootdeveloper.seungchan.controller;


import back.springbootdeveloper.seungchan.domain.Article;
import back.springbootdeveloper.seungchan.dto.scrapcheckdto.ScrapCheckRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 룸복 어노테이션
@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
public class ScrapCheckControllor {

    // HTTP 메서드가 POST일 때 전달 받은 URL와 동일하면 메서드로 매핑
//    @PostMapping("/api/articles")부
//    public ResponseEntity<Article> checkMyScrap(@RequestBody ScrapCheckRequestDTO) {
//
//        //
//        return ResponseEntity.ok().body(new Article()); // 응답 코드로 201, Created를 응답하
//    }
}
