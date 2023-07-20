package back.springbootdeveloper.seungchan.util;

public class ConstantManager {

    public static String CONTENT_OF_EMAIL(String CHECK_NUM) {
        return "홈페이지를 방문해주셔서 감사합니다. \n" +
                "\n" +
                "인증 번호는 \"" + CHECK_NUM + "\" 입니다. \n" +
                "\n" +
                "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";
    }

    public static String SUBJECT_OF_EMAIL() {
        return " 😎: New Temporary Email Check is here!";
    }
}
