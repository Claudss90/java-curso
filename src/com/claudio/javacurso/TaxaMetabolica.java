package com.claudio.javacurso;

import java.util.Scanner;

public class TaxaMetabolica {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String M = "Masculino";
        String F = "Feminino";

        System.out.println("Digite o gênero: M para");

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Digite sua altura ");
        double altura = scan.nextDouble();
        System.out.println("Digite o nível de atividade física");
        String atvFisica = scan.next();

    }
}
