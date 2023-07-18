package back.springbootdeveloper.seungchan.service;


import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import back.springbootdeveloper.seungchan.domain.Recipients;
import back.springbootdeveloper.seungchan.repository.JpaArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private final JpaArticleRepository articleRepository;

    public ArticleService() {
        this.articleRepository = new JpaArticleRepository();
    }

    public List<OldmanDisables> getArticleOfOldmanDisables() {
        List<OldmanDisables> oldmanDisablesList = articleRepository.findAllOfOldmanDisablesTable();
        return oldmanDisablesList;
    }

    public List<Pregnants> getArticleOfPregnants() {
        List<Pregnants> pregnantsList = articleRepository.findAllOfPregnantsTable();
        return pregnantsList;
    }

    public List<Recipients> getArticleOfRecipients() {
        List<Recipients> recipientsList = articleRepository.findAllOfRecipientsTable();
        return recipientsList;
    }
}
