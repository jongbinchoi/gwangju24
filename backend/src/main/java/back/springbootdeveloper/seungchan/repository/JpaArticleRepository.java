package back.springbootdeveloper.seungchan.repository;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import back.springbootdeveloper.seungchan.domain.Recipients;
import back.springbootdeveloper.seungchan.util.TempDB;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaArticleRepository {
    private TempDB DB;

    public JpaArticleRepository() {
        this.DB = new TempDB();
    }

    public List<OldmanDisables> findAllOfOldmanDisablesTable() {

        return DB.getOldmanDisableList();
    }

    public List<Pregnants> findAllOfPregnantsTable() {
        return DB.getPregnantsList();
    }

    public List<Recipients> findAllOfRecipientsTable() {
        return DB.getRecipientsList();
    }
}
