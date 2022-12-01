package org.example;

import java.time.LocalDate;

public class Pessoa {
    String nome;
    String sobreNome;
    LocalDate dataNascimento;

    String saudacao(int idade){
        return String.format("olá meu nome é "+nome+" "+sobreNome+ " tenho "+ idade +"anos");
    }
}
