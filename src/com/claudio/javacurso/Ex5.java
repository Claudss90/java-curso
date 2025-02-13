package com.claudio.javacurso;
//5. Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class Ex5 {

    public static void main (String[]args){

        Scanner scan = new Scanner((System.in));



        System.out.println("Digite a medida em cm: ");
        float medCm = scan.nextInt();
        float medMetr = medCm / 100;
        System.out.println(medCm + " centímetros em metros é = " + medMetr + " metros");
    }
}
