package com.claudio.javacurso;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args){

        Scanner scan = new Scanner((System.in));

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet. ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os  seguintes valores: ");
        System.out.println("Primeiro nome : " +primeiroNome);
        System.out.println("Idade: " +idade);
        System.out.println("Quantidade de filhos: " +qtdFilhos);
        System.out.println("Altura : " +altura);
        System.out.println("Tem pet? " +temPet);

    }

}
