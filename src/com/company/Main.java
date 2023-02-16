package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    String primeiroNome;
    String segundoNome;

    Scanner sc = new Scanner(System.in);

    System.out.println("qual o primeiro nome? ");
    primeiroNome = sc.next();
    System.out.println("qual o segundo nome? ");
    segundoNome = sc.next();
    System.out.println(nomeCompleto());

    sc.close();

        public static String nomeCompleto(String primeiroNome,String SegundoNome){
            return primeiroNome + "" + SegundoNome;
        }

    }


}
