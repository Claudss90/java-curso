package com.claudio.javacurso;
// Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.
import java.util.Scanner;

public class Ex11 {

    public static void main (String[]args){
        Scanner scan = new Scanner((System.in));

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite um numero real: ");
        float numR = scan.nextFloat();
        int dobNum1 = num1*2;
        int metNum2 = num2/2;
        float tripNum1Num3 = (num1*3) + numR;
        float numRcub = numR * numR * numR;

        System.out.println("dobro do primeiro é: "+ dobNum1 + " a metade do segundo numero é: " +metNum2);
        System.out.println("a soma do triplo do primeiro com o terceiro é: ." +tripNum1Num3);
        System.out.println("o terceiro elevado ao cubo é: " +numRcub);

    }
}
