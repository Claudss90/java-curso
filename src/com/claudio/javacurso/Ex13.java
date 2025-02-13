package com.claudio.javacurso;

import java.util.Scanner;

// Tendo como dados de entrada a altura e o sexo de uma pessoa,
//construa um algoritmo que calcule seu peso ideal, utilizando as
//seguintes fórmulas:
//.
//Para homens: (72.7*h) - 58
//a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//b. Peça o peso da pessoa e informe se ela está dentro, acima ou
//abaixo do peso.
public class Ex13 {

    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));

        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Digite seu sexo: ");
        String sexo = scan.next();

        System.out.println(sexo);



    }
}
