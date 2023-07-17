package back.springbootdeveloper.seungchan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class EmailAuResponseAuthenticationDTO {
    private final String  emailOfAuthentication;
}
