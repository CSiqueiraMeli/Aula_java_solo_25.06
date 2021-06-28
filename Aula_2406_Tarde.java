package Exercicios_java;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aula_2406_Tarde {
    public static void Painel(Scanner keyboard) throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

        int exercicio = 5;
        while (exercicio != 0) {
            System.out.println();
            System.out.println("Java - Aula 3 - Exercicio 2");
            System.out.println("1 - Array em ordem crescente e decrescente");
            System.out.println("2 - Valores das startups");
            System.out.println("3 - Prototipo de Supermercado");
            System.out.println("0 - Voltar para o menu anterior");
            System.out.print("Selecione o exercicio: ");
            exercicio = keyboard.nextInt();
            if(exercicio == 1){
                Exercicio1();
            }
            if(exercicio == 2){
                Exercicio2();
            }
            if(exercicio == 3){
                Exercicio3(keyboard);
            }

        }
    }
    public static void Exercicio1() throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println("Exercicio 1\n\nArray em ordem crescente e decrescente");
		System.out.print("Array inserido: ");
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        for(Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.print("Array em ordem crescente: ");
        for(Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0;i<array.length;i++) {

            array[i]=-array[i];
        }
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++) {
        
            array[i]=-array[i]; 
        }
        System.out.print("Array em ordem decrescente: ");
        for(Integer i: array){
            System.out.print(i + " ");
        }
        System.err.println();
    }
    public static void Exercicio2() throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println("Exercicio 2\n\nCalculo das empresas");
        double x = 1.13;
        double y = 18.4;
        int ano = 2021;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        while(x < y){
            System.out.println("Empresa X - 01/01/)" + ano + " - Valor da empresa: " + decimalFormat.format(x) + "m");
            System.out.println("Empresa Y - 01/01/)" + ano + " - Valor da empresa: " + decimalFormat.format(y) + "m");
            x *= 2.48;
            y *= 1.32;
            ano++;
        }
        System.out.println("Empresa X - 01/01/)" + ano + " - Valor da empresa: " + decimalFormat.format(x) + "m");
        System.out.println("Empresa Y - 01/01/)" + ano + " - Valor da empresa: " + decimalFormat.format(y) + "m");
    }
    public static void Exercicio3(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println("Exercicio 3\n\nPrograma supermercado\n");
        List<Produtos_mercado> produtos = new ArrayList<Produtos_mercado>();
        int comando = 5;
        while(comando != 0){
            System.out.println("1 - adicione um item");
            System.out.println("2 - Inserir produtos genericos");
            System.out.println("3 - Imprima a lista");
            System.out.println("0 - Para voltar");
            comando = keyboard.nextInt();
            
    
            if(comando == 1){
                System.out.print("Insira o nome do produto: ");
                String nome = keyboard.next();
                System.out.print("Insira o valor: ");
                Double valor = keyboard.nextDouble();
                System.out.print("Insira a quantidade: ");
                int quantidade = keyboard.nextInt();
                int codigo = produtos.size()+1;
                Produtos_mercado produto = new Produtos_mercado(codigo, nome, valor, quantidade);
                produtos.add(produto);
            }
            if(comando == 2){
                int codigo = produtos.size()+1;
                Produtos_mercado produto1 = new Produtos_mercado(codigo, "Arroz", 10.99 , 2);
                produtos.add(produto1);
                codigo = produtos.size()+1;
                Produtos_mercado produto2 = new Produtos_mercado(codigo, "Feijão", 14.49, 1);
                produtos.add(produto2);
                codigo = produtos.size()+1;
                Produtos_mercado produto3 = new Produtos_mercado(codigo, "Tomate", 9.99, 5);
                produtos.add(produto3);
                System.out.println("\nInsercao realizada com sucesso\n");
                
                
                
            }
            if(comando == 3){
                for (Produtos_mercado i : produtos) {
                    System.out.println(i);
                }
                System.out.println();
                double total = 0;
                for (Produtos_mercado j : produtos) {
                    total += j.getValorTotal();
                }
                System.out.println("Valor Total: " + total + "\n");
            }
        }

        
    }

}