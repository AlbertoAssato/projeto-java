package br.com.caremi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {
    private String cpf;
    private String rg;
    private String nome;
    private String observacao;
    private LocalDateTime data;
}
