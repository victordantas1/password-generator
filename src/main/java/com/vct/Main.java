package com.vct;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password pass = new Password();
        System.out.println("---- Gerador de Senhas -----");
        System.out.print("Insira o tamanho da senha que sera gerada: ");
        int size = sc.nextInt();
        pass.setPassword(pass.generatePassword(size));
        System.out.println("Sua senha: " + pass.getPassword());
    }
    
}