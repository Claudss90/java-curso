package com.claudio.javacurso;
// Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit.
import java.util.Scanner;


public class Ex10 {

    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));

        System.out.println("Qual a temperatura em graus Celsius?");
        float tempCels = scan.nextFloat();
        float tempFar = ((tempCels * 9) / 5) + 32;
        System.out.println(tempFar+ " C° e a temperatura convertida para Celsius.");

    }
}
