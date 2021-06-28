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

                System.out.println("Aulas realizadas:\n");
                System.out.println("1 - Java - Aula 3 - Exercicio 1");
                System.out.println("2 - Java - Aula 3 - Exercicio 2");
                System.out.println("3 - Java - Aula 4 - Exercício 2");
                System.out.println("0 - Sair");
                System.out.print("Selecione a aula para exibir seus execicios: ");

                exercicio = keyboard.nextInt();
                if (exercicio == 1)
                    Aula_2406_Manha.Painel(keyboard);
                if (exercicio == 2)
                    Aula_2406_Tarde.Painel(keyboard);
                if (exercicio == 3)
                    Aula_2506_classes.Painel(keyboard);
            }
            System.out.println("O programa foi finalizado");
            keyboard.close();
        } catch (Exception e) {
            

        } finally {
        }
    }

}
