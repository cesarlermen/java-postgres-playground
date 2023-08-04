package com.example;

class Cliente {
    double renda;
    char sexo;
    int anoNascimento;
}

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando Classes.");
        Cliente cliente = new Cliente();
        cliente.renda = 10000;
        cliente.sexo = 'M';
        cliente.anoNascimento = 1990;
        System.out.println("Renda: " + cliente.renda);
        System.out.println("Sexo: " + cliente.sexo);
        System.out.println("Ano Nascimento: " + cliente.anoNascimento);

        Cliente cliente2 = new Cliente();
        cliente.renda = 2000;
        cliente.sexo = 'F';
        cliente.anoNascimento = 1980;
        System.out.println("Renda: " + cliente2.renda);
        System.out.println("Sexo: " + cliente2.sexo);
        System.out.println("Ano Nascimento: " + cliente2.anoNascimento);
        
    }
}
