import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
            System.out.println("2 - Classe Counter");
            System.out.println("3 - Classe book");
            System.out.println("4 - Classe fracao");
            System.out.println("0 - Voltar para o menu anterior");
            System.out.print("Selecione o exercicio: ");
            exercicio = keyboard.nextInt();
            if (exercicio == 1)
                Exercicio1();
            if (exercicio == 2)
                Exercicio2(keyboard);
            if (exercicio == 3)
                Exercicio3(keyboard);
            if (exercicio == 4)
                Exercicio4(keyboard);

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
        System.out.println("Exercicio 2 - Classe Counter");
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

    public static void Exercicio3(Scanner keyboard) {
        System.out.println("Exercicio 3 - Classe Book\n");
        int comando = 5;
        int comando2 = 5;
        List<book> books = new ArrayList<book>();
        book book1 = new book("A divina Comédia", "Dante Alighieri", 525467);
        book book2 = new book("A revolucao dos bichos", "George Orwell", 675234765);
        book book3 = new book("Senhor dos aneis - A sociedade do anel", "J. R. R. Tolkien", 23423566);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        while (comando2 != 0) {
            System.out.println();
            System.out.println("1 - Livro disponíveis");
            System.out.println("2 - Devolver um livro");
            System.out.println("3 - Emprestar um livro");
            System.out.println("4 - adicionar um livro");
            System.out.println("0 - Voltar");
            comando = keyboard.nextInt();

            if (comando == 1) {
                for (book book : books) {
                    System.out.println(book);
                }
            }
            if (comando == 2) {
                int numero = 1;
                System.out.println("\nDEVOLUCAO");
                for (book book : books) {
                    System.out.println(numero + " - " + book.getNome() + " - " + book.livroDisponivel());
                    numero++;
                }
                System.out.print("Qual livro ira devolver?");
                comando = keyboard.nextInt();
                if ((comando - 1) < books.size() && (comando - 1) >= 0
                        && books.get((comando - 1)).getEmprestado() == true)
                    books.get((comando - 1)).devolver();
                else
                    System.out.println("Livro indisponível");
            }
            if (comando == 3) {
                int numero = 1;
                System.out.println("\nEMPRESTIMO");
                for (book book : books) {
                    System.out.println(numero + " - " + book.getNome());
                    numero++;
                }
                System.out.print("Qual livro ira pegar emprestado?");
                comando = keyboard.nextInt();
                if ((comando - 1) < books.size() && (comando - 1) >= 0
                        && books.get((comando - 1)).getEmprestado() == false)
                    books.get((comando - 1)).emprestimo();
                else
                    System.out.println("Livro indisponível");
            }
            if (comando == 4) {
                System.out.println("\nAdicionar um livro");
                System.out.print("Nome do livro: ");
                String nome = keyboard.next();
                System.out.print("\nNome do Autor: ");
                String autor = keyboard.next();
                System.out.print("\nISBN(apenas numeros): ");
                int isbn = keyboard.nextInt();
                book book = new book(nome, autor, isbn);
                books.add(book);
            }
        }
    }

    public static void Exercicio4(Scanner keyboard) {
        int comando = 5;
        while (comando != 0) {
        System.out.println("Exercicio 4 - Classe Fracoes\n");
        System.out.println("1 - somar duas fracoes\n");
        System.out.println("2 - subtrair duas fracoes\n");
        System.out.println("3 - dividir duas fracoes\n");
        System.out.println("4 - multiplicar duas fracoes\n");
        System.out.println("0 - voltar\n");
        comando = keyboard.nextInt();
        if (comando == 1) {
            System.out.print("Insira a primeira fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao1 = pegaFracao(keyboard);
            System.out.print("Insira a segunda fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao2 = pegaFracao(keyboard);
            fracao1.soma(fracao2);
        }
        if (comando == 2) {
            System.out.print("Insira a primeira fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao1 = pegaFracao(keyboard);
            System.out.print("Insira a segunda fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao2 = pegaFracao(keyboard);
            fracao1.subtracao(fracao2);
        }
        if (comando == 3) {
            System.out.print("Insira a primeira fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao1 = pegaFracao(keyboard);
            System.out.print("Insira a segunda fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao2 = pegaFracao(keyboard);
            fracao1.divisao(fracao2);
        }
        if (comando == 4) {
            System.out.print("Insira a primeira fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao1 = pegaFracao(keyboard);
            System.out.print("Insira a segunda fracao(ex. 1/4) ou inteiro: ");
            Fracao fracao2 = pegaFracao(keyboard);
            fracao1.multiplicacao(fracao2);
        }
    }

    }

    public static Fracao pegaFracao(Scanner keyboard) {
        String f = keyboard.next();
        if(!f.contains("/")) {
            int inteiro = Integer.parseInt(f);
            Fracao fracao = new Fracao(inteiro, 1);
            return fracao;
        }

        else {
            String[] f1 = f.split("/");
            int numerador1 = Integer.parseInt(f1[0]);
            int numerador2 = Integer.parseInt(f1[1]);
            Fracao fracao = new Fracao(numerador1, numerador2);
            return fracao;
        }

    }
}
