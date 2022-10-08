package com.company;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // instanciou a classe Conta
        primeiraConta.saldo = 123.00;
        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // referenciou a primeira conta
        segundaConta.saldo = 200.00; // atribuiu o valor à primeira
        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("Mesma conta.");
        }
    }
}
