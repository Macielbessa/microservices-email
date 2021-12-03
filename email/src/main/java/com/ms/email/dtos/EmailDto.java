package com.ms.email.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {
//Atribuitos
@NotBlank
private String ownerRef;
// NotBlack não permite valores nulos e o comprimento deve ser maior que zero
    @NotBlank
    @Email // verifica se á um email válido
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

}
