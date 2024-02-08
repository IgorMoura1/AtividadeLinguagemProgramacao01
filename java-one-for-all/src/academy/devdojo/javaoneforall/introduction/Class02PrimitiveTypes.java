package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // Os oitos tipos de tipos primitivos
        // int, double, float, boolean, char, byte, short, long
        // Eles são tipos que a gente pode declarar variáveis, que são valores simples
        // Os tipos primitivos numéricos são:
        //
        // byte: Representa números inteiros de 8 bits.
        // short: Representa números inteiros de 16 bits.
        // int: Representa números inteiros de 32 bits.
        // long: Representa números inteiros de 64 bits.
        // float: Representa números de ponto flutuante de 32 bits.
        // double: Representa números de ponto flutuante de 64 bits.
        // Os tipos primitivos não numéricos são:
        //
        // char: Representa caracteres Unicode de 16 bits ou tabela ascii.
        // boolean: Representa valores lógicos, ou seja, verdadeiro ou falso.
        // todos os nomes são em lowercase!
        int age = (int) 10000000000L; //isso é um casting (forçando o valor para virar int);
        long numeroGrande = 100000;
        long numeroGrandeDouble = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "um grandeeee texto";
        System.out.println("A idade é "+age+ " anos");
        System.out.println(false);
        System.out.println("char "+caractere);
        System.out.println(age);
        System.out.println(numeroGrandeDouble);
    }
}
