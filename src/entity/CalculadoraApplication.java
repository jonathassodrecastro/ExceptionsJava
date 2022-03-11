package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApplication {
    public static void main(String[] args) {

        CalculadoraMenu calculadoraMenu = new CalculadoraMenu();

        int opc = calculadoraMenu.getOpc();
        String novaOperacao = calculadoraMenu.getNovaOperacao();

        //Chamada do Menu
        calculadoraMenu.montaMenu(opc, novaOperacao);

    }
}
