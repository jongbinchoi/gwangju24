/*
package back.springbootdeveloper.seungchan.add;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender NaverMailService() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        // javaMailSender.setHost("smtp.naver.com");  // SMTP 서버명 <------ 사용
        // javaMailSender.setUsername("dmdrk1414@naver"); // 네이버 아이디 <------ 사용
        // javaMailSender.setPassword("네이버비밀번"); // 네이버 비밀번호 <------ 사용

        // javaMailSender.setPort(465); // SMTP 포트 <------ 사용

        javaMailSender.setJavaMailProperties(getMailProperties()); // 메일 인증서버 가져오기

        return javaMailSender;
    }

    // 메일 인증서버 정보 가져오기
    private Properties getMailProperties() {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp"); // 프로토콜 설정
        properties.setProperty("mail.smtps.ssl.protocols", "SSLv2Hello SSLv3"); // 프로토콜 설정
        //properties.setProperty("mail.smtp.auth", "true"); // smtp 인증 <------ 사용
        // properties.setProperty("mail.smtp.starttls.enable", "true"); // smtp strattles 사용 <------ 사용
        properties.setProperty("mail.debug", "true"); // 디버그 사용
        // properties.setProperty("mail.smtp.ssl.trust", "smtp.naver.com"); // ssl 인증 서버 (smtp 서버명) <------ 사용
        // properties.setProperty("mail.smtp.ssl.enable", "true"); // ssl 사용 <------ 사용

        return properties;
    }
}
*/