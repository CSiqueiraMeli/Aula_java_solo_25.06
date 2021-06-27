package Exercicios_java;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        try {
            int exercicio = 1;
            Scanner keyboard = new Scanner(System.in);

            while (exercicio != 0) {
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    Runtime.getRuntime().exec("clear");
                
                System.out.println("Selecione a Aula:");
                System.out.println("1 - Java - Aula 3 - Exercicio 1");
                System.out.println("0 - Sair");
                exercicio = keyboard.nextInt();
                if (exercicio == 1)
                    Aula_2406_Manha.Painel(keyboard);
            }
            System.out.println("O programa foi finalizado");
            keyboard.close();
        } catch (Exception e) {
            System.out.println(e);

        } finally {
        }
    }

}
