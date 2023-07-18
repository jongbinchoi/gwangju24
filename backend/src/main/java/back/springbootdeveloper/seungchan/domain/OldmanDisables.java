package back.springbootdeveloper.seungchan.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OldmanDisables {
    private long id; // 고유 게시물의 정보
    private String title; // 게시물 제목
    private String author; // 게시물 저서
    private String date; // 게시물 날짜
    private String content; // 게시물 내용
    private boolean isScrapCheck; // 스크랩 활성화 하기 위한 선택을 하기 위한 API

    @Builder
    public OldmanDisables(long id, String title, String author, String date, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.content = content;
        this.isScrapCheck = false;
    }
}