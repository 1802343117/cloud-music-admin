package com.soft1851.music.admin.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 12559
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {

    private String name;
    private String password;
    private String verifyCode;

}
