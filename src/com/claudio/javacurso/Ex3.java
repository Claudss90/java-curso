package com.claudio.javacurso;
//3. Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

    public class Ex3 {
        public static void main (String[]args){
            Scanner scan = new Scanner((System.in));



            System.out.println("Digite o primeiro número: ");
            int randNum1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            int randNum2 = scan.nextInt();
            int somaTotal = randNum1 + randNum2;
            System.out.println("A soma dos números que você digitou foi: " +somaTotal);

    }
}

