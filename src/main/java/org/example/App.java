package org.example;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Ler entradas para nome, sobrenome e data de nascimento

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe seu nome:");
        pessoa.nome = sc.next();

        System.out.println("Informe seu sobrenome:");
        pessoa.sobreNome = sc.next();

        System.out.println("Informe seu ano de nascimento: dd/MM/yyyy");
        pessoa.dataNascimento = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int idade = LocalDate.now().getYear() - pessoa.dataNascimento.getYear();

        System.out.println(pessoa.saudacao(idade));

    }
}
