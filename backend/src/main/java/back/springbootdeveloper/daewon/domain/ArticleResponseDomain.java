package back.springbootdeveloper.daewon.domain;

// import jakarta.persistence.*;
import lombok.*;

// @Entity
@Getter // Getter 메서드 대안
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 대안
public class ArticleResponseDomain {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id", updatable = false)
    private long id; //

    // @Column(name = "title", nullable = false)
    private String title; // 제목

    @Builder // 빌더 패턴으로 객체 생성
    public ArticleResponseDomain(long id, String title) {
        this.id = id;
        this.title = title;
    }
}

