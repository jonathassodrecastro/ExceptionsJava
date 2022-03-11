package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMenu extends CalculadoraMetodos {
    protected int opc;
    protected String novaOperacao;

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        opc = this.opc;
    }

    public String getNovaOperacao() {
        return novaOperacao;
    }

    public void setNovaOperacao(String novaOperacao) {
        novaOperacao = this.novaOperacao;
    }

    public void montaMenu(int opc, String novaOperacao) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraMetodos calculadoraMetodos = new CalculadoraMetodos();

        do {

                do {
                    try {

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
                } catch (InputMismatchException e) {
                    System.out.println("O menu aceita apenas números de 0 a 4!");
                    System.out.println("\nVoltando ao meu inicial...");
                    novaOperacao = scanner.next();
                }
                }

                while (opc == 0);

                if (opc == 0) {
                    break;
                } else {
                    System.out.println("\nDeseja realizar uma nova operação? S/N");
                    novaOperacao = scanner.next();
                }




        } while (novaOperacao == null || novaOperacao.equals("S"));
        System.out.println("\nAté a próxima!");

    }
}