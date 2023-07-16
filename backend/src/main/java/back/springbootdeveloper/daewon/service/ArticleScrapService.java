package back.springbootdeveloper.daewon.service;

import back.springbootdeveloper.daewon.domain.Article;
import back.springbootdeveloper.daewon.domain.ArticleResponseDomain;
//import back.springbootdeveloper.daewon.repository.ArticleScrapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor // final이 붙거나  @NotNull이 붙는 필드의 생성자 추가
@Service
public class ArticleScrapService {

    @Autowired
    //private final ArticleScrapRepository articleScrapRepository;

    public List<Article> findAll() {
        List<Article> list = new ArrayList<>();
        long id = 1;
        for (int i = 0; i < 3; i++) {
            list.add(new Article("컴공 김대원 논란", id++));
        }
        return list;

        // return articleScrapRepository.findAll();
    }

    public Article findById(long id) {
       /* return articleScrapRepository.findById(id) // JPA에서 제공하는 메서드 findById()을 이용한다.
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id)); // 찾아서 없으면 예외처리.*/
        Article article = new Article();
        article.setId(999);
        article.setTitle("Fake Article Title");
        return article;
    }
}
