package com.company;

public class Conta {
    Cliente titular;

    int agencia;
    int numero;

    double saldo;

    void DepositaValor(double valor){
       this.saldo += valor;
       /* Quando o método for chamado, o "this" (que antes estava implícito)
          evidencia que ele foi chamado por uma instância específica, e não
          qualquer instância. É uma referência pois aponta a um atributo de
          um objeto. */

    }

    boolean SacaValor (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            System.out.println("Não foi possível completar a transação. Saldo insuficiente.");
            return false;
        }
     }

    boolean TransfereValor(double valor, Conta destino){
        boolean saldoSuficiente = SacaValor(valor);
            /* */
        if (saldoSuficiente) {          // mesmo que "(saldoSuficiente == true)"
            destino.DepositaValor(valor);
            return true;
        }
        return false;
    }
}

