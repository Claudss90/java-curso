package com.claudio.javacurso;
//2. Faça um Programa que peça um número e então mostre a
// mensagem O número informado foi [número].
import java.util.Scanner;

public class Ex2 {
    public static void main (String[]args){
    Scanner scan = new Scanner((System.in));



        System.out.println("Digite um número? ");
        int randNum = scan.nextInt();
        System.out.println("O número que você digitou foi: " +randNum);

    }
    }
