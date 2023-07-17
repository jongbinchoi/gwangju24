package back.springbootdeveloper.seungchan.service;

import back.springbootdeveloper.seungchan.util.ConstantManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String senderOfDeveloper;

    public String sendSimpleMessage(String emailOfClient) {
        String checkNumOfEmail = getCheckNumOfEmail(); // 임시 번호를 할당
        String contentOfEmail = ConstantManager.CONTENT_OF_EMAIL(checkNumOfEmail);
        String subjectOfEmail = ConstantManager.SUBJECT_OF_EMAIL();

        //메세지를 생성하고 보낼 메일 설정 저장
        SimpleMailMessage messageFormOfEmail = getMessageFormOfEmail(emailOfClient, senderOfDeveloper, contentOfEmail, subjectOfEmail);

        mailSender.send(messageFormOfEmail);
        return checkNumOfEmail;
    }

    private SimpleMailMessage getMessageFormOfEmail(String emailOfClient, String senderOfDeveloper, String contentOfEmail, String subjectOfEmail) {
        SimpleMailMessage messageOfEmail = new SimpleMailMessage();
        messageOfEmail.setTo(emailOfClient); // 회원 이메일
        messageOfEmail.setFrom(senderOfDeveloper); // 계발자의 이메일
        messageOfEmail.setText(contentOfEmail); // 이메일 내용
        messageOfEmail.setSubject(subjectOfEmail); // 이메일 제목
        return messageOfEmail;
    }

    private String getCheckNumOfEmail() {
        Random random = new Random();
        String checkNum = String.valueOf(random.nextInt(888888) + 111111);
        return checkNum;
    }
}