package com.ms.email.models;


import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity // informa que a classe é uma entidade, estabelecendo a ligação entre a tabela e a entidade
@Table(name = "TB_EMAIL")//criando uma tabela no banco de dados
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id// informa ao jpa que o atribuito/método está relacionado a chave primária no banco de dados
    @GeneratedValue(strategy = GenerationType.AUTO)// irá ser gerado automaticamente no banco de dados
    private UUID emailID; //atribuito
    private String ownerRef; //atribuito
    private String emailFrom; //atribuito
    private String emailTo; //atribuito
    private String subject; //atribuito
    @Column(columnDefinition = "TEXT")
    private String text; //atribuito
    private LocalDateTime sendDateEmail; //atribuito
    private StatusEmail statusEmail; //atribuito


}
