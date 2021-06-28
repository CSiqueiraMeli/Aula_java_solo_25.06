package Exercicios_java;

import java.io.IOException;
import java.util.Scanner;

public class Aula_2506_classes {
    public static void Painel(Scanner keyboard) throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        int exercicio = 7;
        while (exercicio != 0) {
            System.out.println();
            System.out.println("Java - Aula 3 - Exercicio 1");
            System.out.println("1 - Classe conta corrente");
            System.out.println("0 - Voltar para o menu anterior");
            System.out.print("Selecione o exercicio: ");
            exercicio = keyboard.nextInt();
            if (exercicio == 1) {
                Exercicio1();
            }
        }
    }

    public static void Exercicio1() {
        System.out.println("Exercicio 1 - Classe Conta corrente");
        Usuario usuario1 = new Usuario("Cleberson Siqueira", 123);
        Usuario usuario2 = new Usuario("Jucemara Matos", 325);
        Conta_Corente conta1 = new Conta_Corente(usuario1, 54634, 2456, 0);
        Conta_Corente conta2 = new Conta_Corente(usuario2, 7598, 2456, 2000);
        System.out.println();
        System.out.println(conta1);
        System.out.println();
        System.out.println(conta2);

        conta1.deposito(500);
        conta2.saque(158);
        System.out.println();
        System.out.println(conta1);
        System.err.println();
        System.out.println(conta2);

        conta1.transferencia(790, conta2);
        conta1.transferencia(79, conta2);
        System.out.println();
        System.out.println(conta1);
        System.err.println();
        System.out.println(conta2);
    }

    public static void Exercicio2(Scanner keyboard) {
        System.out.println("Exercicio 2 - Classe Ccounter");
        counter counter = new counter(0);
        int comando = 5;
        while (comando != 0) {
            System.out.println(counter);
            System.out.println("1 - adicionar + 1");
            System.out.println("2 - Diminuir -1");
            System.out.println("3 - Para resetar o contador");
            System.out.println("0 - Para voltar");

            comando = keyboard.nextInt();
            if (comando == 1)
                counter.aumentaContagem();
            if (comando == 2)
                counter.diminuiContagem();
            if (comando == 3)
                counter.resetaContagem();
        }
    }
}
