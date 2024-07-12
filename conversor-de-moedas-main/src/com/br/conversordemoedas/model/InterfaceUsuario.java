package com.br.conversordemoedas.model;

import java.util.Scanner;

public class InterfaceUsuario {
    boolean cont = true;
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        while (cont) {
            System.out.println("\n" +
                    "***** Conversor de Moedas *****");

            System.out.println("1. USD para BRL");
            System.out.println("2. EUR para BRL");
            System.out.println("3. ARS para BRL");
            System.out.println("4. AUD para BRL");
            System.out.println("5. BRL para GBP");
            System.out.println("6. BRL para RUB");
            System.out.println("Digite SAIR para encerrar o conversor.");

            System.out.println("Escolha uma das opções acima: ");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":

                    this.realizarConversao("USD", "BRL");
                    break;

                case "2":
                    this.realizarConversao("EUR", "BRL");
                    break;

                case "3":
                    this.realizarConversao("ARS", "BRL");
                    break;

                case "4":
                    this.realizarConversao("AUD", "BRL");
                    break;

                case "5":
                    this.realizarConversao("BRL", "GBP");
                    break;

                case "6":
                    this.realizarConversao("BRL", "RUB");

                    break;

                default:
                    if (escolha.equals("SAIR")){
                        System.out.println("Saindo...");
                        cont = false;
                    } else {
                        System.out.println("Opção Inválida! " +
                                "Selecione uma opção valida. ");
                    }
                    break;
            }

        }
    }

    public void realizarConversao(String moeda1, String moeda2){

        System.out.println("Digite o valor a ser convertido: ");
        try {
            double valor = scanner.nextDouble();
            scanner.nextLine();
            Conversor conversor = new Conversor(moeda1, moeda2, valor);

            ConexaoApi conexaoApi = new ConexaoApi(conversor);
            System.out.println(conexaoApi.ConsumoApi());

        } catch (Exception e){
            System.out.println("Escolha uma opção válida!");
        }

    }
}
