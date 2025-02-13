package com.claudio.javacurso;
//6. Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área.
import java.util.Scanner;

public class Ex6 {
    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));



        System.out.println("Digite o valor do raio do circulo: ");
        float valorRaio = scan.nextFloat();
        double valorPi = Math.PI;
        double valorArea = valorRaio * valorRaio * valorPi;
        System.out.println(valorArea+ " é área do circulo");



    }
}
