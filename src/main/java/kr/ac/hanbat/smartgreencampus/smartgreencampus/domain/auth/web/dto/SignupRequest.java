package kr.ac.hanbat.smartgreencampus.smartgreencampus.domain.auth.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public record SignupRequest(

        @NotBlank @Email(message = "이메일 형식에 맞지 않습니다.") String email,

        @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=\\S+$).{4,20}",
                message = "비밀번호는 영문과 숫자가 포함된 4자 ~ 20자의 비밀번호여야 합니다.")
        @NotBlank String password1,
        @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=\\S+$).{4,20}",
                message = "비밀번호는 영문과 숫자가 포함된 4자 ~ 20자의 비밀번호여야 합니다.")
        @NotBlank String password2
) { }