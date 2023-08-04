package com.example;
import java.util.Scanner;

public class AppPalindromo {
    public static void main(String[] args){
        Scanner PalavraDigitada = new Scanner(System.in);
        System.out.println("Digite uma palavra para verifica se é um palíndromo:");
        String Palavra = PalavraDigitada.next();
        String Palindromo = "";

        for (int i = Palavra.length() - 1; i >= 0; i--) {
            Palindromo = Palindromo + Palavra.charAt(i);
        }

        if (Palindromo.equals(Palavra)){
            System.out.println("A palavra " + Palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + Palavra + " NÃO é um palíndromo.");
        }
    System.out.println("Palavra: " + Palavra);
    System.out.println("Palindromo: " + Palindromo);
    }
    
}
