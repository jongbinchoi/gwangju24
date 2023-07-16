package back.springbootdeveloper.daewon.dto.oldmansdisables;

import back.springbootdeveloper.daewon.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OldmansDisablesArticleRequest {
    private String title;  // 게시물의 제목을 나타낸다.
}
