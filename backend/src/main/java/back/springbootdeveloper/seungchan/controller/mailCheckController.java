package back.springbootdeveloper.seungchan.controller;

import back.springbootdeveloper.seungchan.dto.EmailAuResponseAuthenticationDTO;
import back.springbootdeveloper.seungchan.dto.EmailRequestDTO;
import back.springbootdeveloper.seungchan.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 룸복 어노테이션
@ResponseBody
@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
public class mailCheckController {
    private final EmailService emailService;
    @PostMapping("/signup/email-check") // 조회한뒤 반환
    public ResponseEntity<EmailAuResponseAuthenticationDTO> findAllArticles(@RequestBody EmailRequestDTO emailRequestDTO) throws Exception {
        String email = emailRequestDTO.getEmail();

        String confirm = emailService.sendSimpleMessage(email);
        return ResponseEntity.ok()
                .body(new EmailAuResponseAuthenticationDTO(confirm));
    }
}
