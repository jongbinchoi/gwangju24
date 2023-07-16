package back.springbootdeveloper.daewon.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Article {
    private long id; //

    private String title; // 제목
    @Builder
    public Article(String title, long id){
        this.title = title;
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
