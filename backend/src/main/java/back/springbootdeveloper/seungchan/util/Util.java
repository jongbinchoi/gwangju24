package back.springbootdeveloper.seungchan.util;

import back.springbootdeveloper.seungchan.domain.Article;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Article> getTempList() {
        List<Article> list = new ArrayList<>();
        long id = 1;
        for (int i = 0; i < 3; i++) {
            list.add(new Article(id++, "컴공 김대원 논란", "김대원", "2023-07-17", "팩트 컴공 김대원 논란 "));
        }
        return list;
    }
}
