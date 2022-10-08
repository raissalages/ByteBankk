package com.company;

public class CriaConta {

    public static void main(String[] args) {
	 Conta primeiraConta = new Conta();
            /* - Conta é o tipo da variável primeiraConta (mesmo que "String frase")
               - primeiraConta é o objeto/instância da classe Conta
               - new Conta() cria a instância em si */
        primeiraConta.agencia = 12345;
        primeiraConta.numero = 0;
        primeiraConta.saldo =  135.50;
            /* É necessário referenciar o objeto primeiraConta e o seu atributo antes
               de atribuir valores. */

        Cliente Ana = new Cliente();

        Ana.nome = "Ana Clara dos Anjos";
        Ana.CPF = "123.456.789-10";
        Ana.dataNascimento = "03/07/1989";
        Ana.profissao = "Analista de TI";
        Ana.rendaMensal = 6400.00F;

        primeiraConta.titular = Ana;


     Conta segundaConta = new Conta();
        segundaConta.saldo = 100.00;

        Cliente Joao = new Cliente();

        segundaConta.titular = Joao;

        System.out.println("A agencia da segunda conta é " + segundaConta.agencia);
            /* O valor vai ser 0 por definição (default) já que ao instanciar uma classe
               os atributos dos objetos são zerados.
               Apenas o atributo saldo recebeu um valor, nesse caso. */
        System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
        System.out.println("O nome do titular da segunda conta é " + segundaConta.titular.nome);
            /* O valor default de uma String é null. */

        /* Uso do método de depositar da classe Conta */
        segundaConta.DepositaValor(50);
            /* segundaConta é uma instância da classe Conta, enquanto depositaValor() é um
               método da classe Conta. Portanto, o formato é:
                    instânciaClasse.metodoClasse(parâmetro);
                    referênciaClasse.metodoClasse(parametro); */
        System.out.println("Foram depositados 50 reais na segunda conta.");
        System.out.println("O novo saldo da segunda conta é: " + segundaConta.saldo);

        boolean seSacou = segundaConta.SacaValor(300);
        if (seSacou) {          //  mesma coisa que "(seSacou == true)
            System.out.println("Foram sacados 30 reais na segunda conta.");
        }
        System.out.println("O saldo da segunda conta é de: " + segundaConta.saldo);
            /* O retorno do método sacaValor é true (o saque foi bem sucedido) ou false (saldo
               insuficiente). Agora, utilizar o retorno, nesse caso, é opcional. A variável seSacou
               recebe o retorno booleano da função */


        if(primeiraConta.TransfereValor(100, segundaConta)){
            System.out.println("Transferência feita com sucesso!");
        }
            /* Como transfereValor() é um método com retorno booelano, é possível usá-lo como
               verificação condicional. Seria possível também pegar toda essa declaração do
               método e atribuir numa variável booleana. */
        System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo segunda conta: " + segundaConta.saldo);

        boolean sucessoTransferencia = primeiraConta.TransfereValor(10, segundaConta);
        if (sucessoTransferencia) {
            System.out.println("Transferência feita com sucesso!");
        }
        System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo segunda conta: " + segundaConta.saldo);


        System.out.println(primeiraConta.titular.dataNascimento);

    }
}
