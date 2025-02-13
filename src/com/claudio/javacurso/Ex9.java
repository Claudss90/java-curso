package com.claudio.javacurso;
//Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//o C = (5 * (F-32) / 9).
import java.util.Scanner;

public class Ex9 {

    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));

        System.out.println("Qual a temperatura em graus Farenheit?");
        float tempFar = scan.nextFloat();
        float tempCels = (5*(tempFar - 32) / 9);
        System.out.println(tempCels+ " C° e a temperatura convertida para Celsius.");

    }
}
