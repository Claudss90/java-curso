package com.claudio.javacurso;
//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class Ex4 {

    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));



        System.out.println("Digite a nota 1: ");
        double notaNum1 = scan.nextDouble();
        System.out.println("Digite a nota 2: ");
        double notaNum2 = scan.nextDouble();
        System.out.println("Digite a nota 3: ");
        double notaNum3 = scan.nextDouble();
        System.out.println("Digite a nota 4: ");
        double notaNum4 = scan.nextDouble();

        double somaNota = notaNum1 + notaNum2 + notaNum3 + notaNum4;
        double mediaNota = somaNota / 4;
        System.out.println("A média das notas é: " +mediaNota);
    }

}
