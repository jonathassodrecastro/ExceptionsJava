package entity;

import exceptions.CalculadoraExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMetodos {
    Scanner scanner = new Scanner(System.in);

    protected int primeiroNum;
    protected int segundoNum;
    protected int resultado;



    public int getPrimeiroNum() {
        return primeiroNum;
    }

    public void setPrimeiroNum(int primeiroNum) {
        this.primeiroNum = primeiroNum;
    }

    public int getSegundoNum() {
        return segundoNum;
    }

    public void setSegundoNum(int segundoNum) {
        this.segundoNum = segundoNum;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void soma(int primeiroNum, int segundoNum){

            System.out.println("A operação escolhida foi: SOMA.");
            System.out.println("------------------------------");
        try{
            System.out.println("Informe o primeiro elemento:");
            primeiroNum = scanner.nextInt();
            System.out.println("Informe o segundo elemento:");
            segundoNum = scanner.nextInt();
            resultado = primeiroNum + segundoNum;
            System.out.printf("O resultado de %d mais %d é igual a %d", primeiroNum, segundoNum, resultado);
        } catch (InputMismatchException e) {
        System.out.println("A Calculadora aceita apenas números inteiros!");
        }
    }

    public void subtracao(int primeiroNum, int segundoNum) {

            System.out.println("A operação escolhida foi: SUBTRAÇÃO.");
            System.out.println("------------------------------");
        try {
            System.out.println("Informe o primeiro elemento:");
            primeiroNum = scanner.nextInt();
            System.out.println("Informe o segundo elemento:");
            segundoNum = scanner.nextInt();
            resultado = primeiroNum - segundoNum;
            System.out.printf("O resultado de %d menos %d é igual a %d", primeiroNum, segundoNum, resultado);
        }catch (InputMismatchException e) {
            System.out.println("A Calculadora aceita apenas números inteiros!");
        }
    }

    public void multiplicacao(int primeiroNum, int segundoNum) {
        System.out.println("A operação escolhida foi: MULTIPLICAÇÃO.");
        System.out.println("------------------------------");
        try {
            System.out.println("Informe o primeiro elemento:");
            primeiroNum = scanner.nextInt();
            System.out.println("Informe o segundo elemento:");
            segundoNum = scanner.nextInt();
            resultado = primeiroNum * segundoNum;
            System.out.printf("O resultado de %d multiplicado por %d é igual a %d", primeiroNum, segundoNum, resultado);
        } catch (InputMismatchException e) {
            System.out.println("A Calculadora aceita apenas números inteiros!");
        }
    }

    public void divisao(int primeiroNum, int segundoNum) {
        System.out.println("A operação escolhida foi: DIVISÃO.");
        System.out.println("------------------------------");
    try {
        System.out.println("Informe o primeiro elemento:");
        primeiroNum = scanner.nextInt();
        System.out.println("Informe o segundo elemento:");
        segundoNum = scanner.nextInt();
    } catch (InputMismatchException e) {
        System.out.println("A Calculadora aceita apenas números inteiros! " +"Motivo "+e.getMessage());
    }
    try {
        resultado = primeiroNum / segundoNum;
        System.out.printf("\nO resultado de %d dividido por %d é igual a %d", primeiroNum, segundoNum, resultado);
    } catch (ArithmeticException e) {
                System.out.println("\nErro na divisão. O Divisor é igual a 0! "+"Motivo"+e.getMessage());
    }

    }
}