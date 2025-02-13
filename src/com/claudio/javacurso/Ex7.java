package com.claudio.javacurso;
//7. Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class Ex7 {
    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));

        System.out.println("Qual a altura do quadrado? ");
        double altSqr = scan.nextDouble();
        System.out.println("Qual a base do quadrado? ");
        double baseSqr = scan.nextDouble();
        double areaSqr = altSqr * baseSqr;
        System.out.println(areaSqr+ " É a área do quadrado.");
        double dobroArea = areaSqr * 2;
        System.out.println(dobroArea+ " É o dobra da área do quadrado.");

    }
}
