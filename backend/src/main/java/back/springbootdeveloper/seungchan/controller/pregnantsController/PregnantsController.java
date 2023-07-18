package back.springbootdeveloper.seungchan.controller.pregnantsController;

import back.springbootdeveloper.seungchan.domain.Pregnants;
import back.springbootdeveloper.seungchan.dto.pregnantDTO.EachArticleOfPregnantsResponseDTO;
import back.springbootdeveloper.seungchan.service.pregnantsService.PregnantsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 룸복 어노테이션
@RestController
public class PregnantsController {
    private final PregnantsService pregnantsService;

    // 박승찬
    @GetMapping("/article/pregnants/{id}")
    // @PathVariable 매너테이션은 URL에서 값을 가져오는 애너테이션
    // /api/articles/3 GET 요청을 받으면 id에 3이 들어온다.
    public ResponseEntity<EachArticleOfPregnantsResponseDTO> findArticleById(@PathVariable long id) {
        Pregnants article = pregnantsService.findById(id);

        return ResponseEntity.ok()
                .body(new EachArticleOfPregnantsResponseDTO(article));
    }
}
