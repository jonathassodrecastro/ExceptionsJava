package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculadoraMetodos calculadoraMetodos = new CalculadoraMetodos();

        int opc;
        String novaOperacao;

        do {
            do {


                System.out.println("Bem-vindo a sua calculadora! Selecione a operação que deseja realizar\n");
                System.out.println("Digite 1 para SOMA");
                System.out.println("Digite 2 para SUBTRACAO");
                System.out.println("Digite 3 para MULTIPLICACAO");
                System.out.println("Digite 4 para DIVISAO");
                System.out.println("Digite 0 para ENCERRAR a calculadora.");


                opc = scanner.nextInt();

                switch (opc) {
                    case 0:
                        break;
                    case 1:
                        calculadoraMetodos.soma(calculadoraMetodos.getPrimeiroNum(), calculadoraMetodos.getSegundoNum());
                        break;
                    case 2:
                        calculadoraMetodos.subtracao(calculadoraMetodos.getPrimeiroNum(), calculadoraMetodos.getSegundoNum());
                        break;
                    case 3:
                        calculadoraMetodos.multiplicacao(calculadoraMetodos.getPrimeiroNum(), calculadoraMetodos.getSegundoNum());
                        break;
                    case 4:
                        calculadoraMetodos.divisao(calculadoraMetodos.getPrimeiroNum(), calculadoraMetodos.getSegundoNum());
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                    }

                    break;
                }
                while (opc == 0);
                if (opc == 0) {
                    break;
                } else {
                    System.out.println("\nDeseja realizar uma nova operação? S/N");
                    novaOperacao = scanner.next();
                }
            }
            while (novaOperacao == null || novaOperacao.equals("S"));
            System.out.println("\nAté a próxima!");


    }
}
