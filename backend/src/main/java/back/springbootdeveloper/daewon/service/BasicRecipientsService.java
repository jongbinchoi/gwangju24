package back.springbootdeveloper.daewon.service;

import back.springbootdeveloper.daewon.domain.Article;
import back.springbootdeveloper.daewon.domain.ArticleResponseDomain;
//import back.springbootdeveloper.daewon.repository.BasicRecipientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor // final이 붙거나  @NotNull이 붙는 필드의 생성자 추가
@Service  // 해당 클래스를 빈으로 서블릿 컨테이너에 등록
public class BasicRecipientsService {

    @Autowired
    // private final  BasicRecipientsRepository basicRecipientsRepository;
    public List<Article> findAll() {
        List<Article> list = new ArrayList<>();
        long id = 1;
        for (int i = 0; i < 3; i++) {
            list.add(new Article("컴공 김대원 논란", id++));
        }
        return list;
        // return basicRecipientsRepository.findAll();
    }

    public Article findById(long id) {
       /* return basicRecipientsRepository.findById(id) // JPA에서 제공하는 메서드 findById()을 이용한다.
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id)); // 찾아서 없으면 예외처리.*/
        Article article = new Article();
        article.setId(999);
        article.setTitle("Fake Article Title");
        return article;
    }
/*
    public List<Article> findAll() {return basicRecipientsRepository.findAll();}

    public Article findById(long id) {
        return basicRecipientsRepository.findById(id) // JPA에서 제공하는 메서드 findById()을 이용한다.
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id)); // 찾아서 없으면 예외처리.
    }
*/
}
