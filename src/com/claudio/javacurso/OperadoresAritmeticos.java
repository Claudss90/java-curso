package com.claudio.javacurso;

public class OperadoresAritmeticos {

    public static void main(String[] args){

        int resultado = 1 + 2;


        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        System.out.println(resultado++);
        System.out.println(++resultado);
        System.out.println(resultado--);
        System.out.println(--resultado);

    }

}
