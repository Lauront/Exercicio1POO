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
    public static void main( String[] args ) throws ParseException {

        //TODO Ler entradas para nome, sobrenome e data de nascimento
        Scanner sc = new Scanner(System.in);
        String nome;
        String sobreNome;
        LocalDate dataNascimento;

        System.out.println("Informe seu nome:");
        nome = sc.next();

        System.out.println("Informe seu sobrenome:");
        sobreNome = sc.next();

        System.out.println("Informe seu nome:");
        dataNascimento = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int idade = LocalDate.now().getYear() - dataNascimento.getYear();

        System.out.println("olá meu nome é "+nome+" "+sobreNome+ " tenho "+ idade +"anos");

        //TODO Imprimir saudação "Olá seu nome <nome> <sobrenome> tenho <x> anos de idade!"

    }
}
