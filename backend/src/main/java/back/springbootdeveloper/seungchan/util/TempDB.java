package back.springbootdeveloper.seungchan.util;

import back.springbootdeveloper.seungchan.domain.OldmanDisables;
import back.springbootdeveloper.seungchan.domain.Pregnants;
import back.springbootdeveloper.seungchan.domain.Recipients;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TempDB {
    static final String OLDMAN_DISABLE_PATH = "classpath:config/json/oldmanDisablesTable.json";
    static final String PREGNANTS_PATH = "classpath:config/json/pregnantsTable.json";
    static final String RECIPIENTS_PATH = "classpath:config/json/recipientsTable.json";

    public List<Recipients> getRecipientsList() {
        List<Recipients> Data = new ArrayList<>();

        try {
            JSONParser parser = new JSONParser();
            File file = ResourceUtils.getFile(PREGNANTS_PATH);
            // JSON 파일 읽기
            Reader reader = new FileReader(file);
            JSONArray dataArray = (JSONArray) parser.parse(reader);

            for (Object obj : dataArray) {
                JSONObject element = (JSONObject) obj;
                Long id = (Long) element.get("id");
                String title = (String) element.get("title");
                String author = (String) element.get("author");
                String date = (String) element.get("date");
                String content = (String) element.get("content");
                Boolean isScrapCheck = (Boolean) element.get("isScrapCheck");

                Recipients recipients = Recipients.builder()
                        .id(id)
                        .title(title)
                        .author(author)
                        .date(date)
                        .content(content)
                        .build();

                Data.add(recipients);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return Data;
    }

    public List<Pregnants> getPregnantsList() {
        List<Pregnants> Data = new ArrayList<>();

        try {
            JSONParser parser = new JSONParser();
            File file = ResourceUtils.getFile(RECIPIENTS_PATH);
            // JSON 파일 읽기
            Reader reader = new FileReader(file);
            JSONArray dataArray = (JSONArray) parser.parse(reader);

            for (Object obj : dataArray) {
                JSONObject element = (JSONObject) obj;
                Long id = (Long) element.get("id");
                String title = (String) element.get("title");
                String author = (String) element.get("author");
                String date = (String) element.get("date");
                String content = (String) element.get("content");
                Boolean isScrapCheck = (Boolean) element.get("isScrapCheck");

                Pregnants pregnants = Pregnants.builder()
                        .id(id)
                        .title(title)
                        .author(author)
                        .date(date)
                        .content(content)
                        .build();

                Data.add(pregnants);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return Data;
    }

    public List<OldmanDisables> getOldmanDisableList() {
        List<OldmanDisables> Data = new ArrayList<>();

        try {
            JSONParser parser = new JSONParser();
            File file = ResourceUtils.getFile(OLDMAN_DISABLE_PATH);
            // JSON 파일 읽기
            Reader reader = new FileReader(file);
            JSONArray dataArray = (JSONArray) parser.parse(reader);

            for (Object obj : dataArray) {
                JSONObject element = (JSONObject) obj;
                Long id = (Long) element.get("id");
                String title = (String) element.get("title");
                String author = (String) element.get("author");
                String date = (String) element.get("date");
                String content = (String) element.get("content");
                Boolean isScrapCheck = (Boolean) element.get("isScrapCheck");

                OldmanDisables oldmanDisables = OldmanDisables.builder()
                        .id(id)
                        .title(title)
                        .author(author)
                        .date(date)
                        .content(content)
                        .build();

                Data.add(oldmanDisables);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return Data;
    }
}
