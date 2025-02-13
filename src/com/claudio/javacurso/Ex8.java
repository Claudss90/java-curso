package com.claudio.javacurso;
//Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.***
import java.util.Scanner;

    public class Ex8 {

        public static void main (String[]args){
            Scanner scan = new Scanner((System.in));

            System.out.println("Quanto você ganha por mês? ");
            double salMes = scan.nextDouble();
            System.out.println("Quantos dia você trabalho nesse mês");
            int diasTrab = scan.nextInt();
            System.out.println("Quantas horas você trabalha por dia");
            int horasTrabD = scan.nextInt();
            int horasTrabM = horasTrabD * diasTrab;
            int horasTrabS = horasTrabM / 4;
            double salHora = salMes / horasTrabM;
            System.out.println("voce trabalhou no mês: " +horasTrabM + " horas");
            System.out.println("E " +horasTrabS +" horas por semana");
            System.out.println("R$" +salHora+ " foi o seu salário por hora " + "e R$" + salMes + " por mês");

    }
}
