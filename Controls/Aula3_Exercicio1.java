package Controls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula3_Exercicio1 {
	public static void Painel(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		int exercicio = 7;
		while(exercicio != 0){
			System.out.println();
			System.out.println("Java - Aula 3 - Exercicio 1");
			System.out.println("1 - Primeiros numeros Pares\n2 - Mutiplos\n3 - Verificar se o numero é primo");
			System.out.println("4 - Numeros primos seguidos\n5 - Lista de numeros naturais\n0 - Voltar para o menu anterior");
			System.out.print("Selecione o exercicio: ");
			exercicio = keyboard.nextInt();
			if(exercicio == 1){
				Exercicio1(keyboard); 
			}
			if(exercicio == 2){
				Exercicio2(keyboard); 
			}
			if(exercicio == 3){
				Exercicio3(keyboard); 
			}
			if(exercicio == 4){
				Exercicio4(keyboard); 
			}
			if(exercicio == 5){
				Exercicio5(keyboard); 
			}
		}
	}

	public static void Exercicio1(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println("Exercicio 1\n\nQuantos pares tem de 0 a X");
		System.out.print("Insira o numero final: ");
		
		int comando = keyboard.nextInt();
		System.out.println("Os pares ate " + comando + " são:");
	
		for (int i = 1; i <= comando; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

	}

	public static void Exercicio2(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println();
		System.out.println("Exercicio 2\n\nPrimeiros X numeros que são multiplos de Y");
		System.out.print("Insira a quantidade de verificacoes: ");
		int comando2 = keyboard.nextInt();
		System.out.print("Insira o numero a ser multiplicado: ");
		int comando = keyboard.nextInt();
		
		int i = 1;
		while (i <= comando2){
			System.out.println((comando * i));
			i++;
		}
	}

	public static void Exercicio3(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println();
		System.out.println("Exercicio 3\n\nVerificar se um numero é primo");
		System.out.print("Insira o numero a ser verificado: ");
		String status = " é um número primo";
		int comando = keyboard.nextInt();
		for (int i = 1; i < comando; i++) {
			if (comando % i == 0 && i != 1) {
				status = " não é primo";
			}
		}
		System.out.println("O numero " + comando + status);
	}

	public static void Exercicio4(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println();
		System.out.println("Exercicio 4\n\nVerificar todos os numeros primos de 1 a X");
		System.out.print("Insira o numero final da contagem ");
		int comando = keyboard.nextInt();
	
		if (comando > 1){
			System.out.println("O numeros primos de 0 a " + comando + " sao");
			for (int i = 2; i <= comando; i++) {
				for (int j = 2; j <= comando; j++) {
					if (i % j == 0 && i == j) {
						System.out.print(j + " - ");
					} else if (i % j == 0 && i != j) {
						i++;
					}
				}
			}
		}
		else{
			System.out.println("Não existem numeros primos neste range");
		}
		
	}
	public static void Exercicio5(Scanner keyboard) throws InterruptedException, IOException{
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
		System.out.println();
		System.out.println("Exercicio 5\n\nOs primeiros numeros X, com ao menos Y numeros iguais a Z em sua composicao");
		System.out.print("Insira o numero de contagem(X): ");
		int comando = keyboard.nextInt();
		System.out.print("Insira a quantidade de numeros iguais(Y): ");
		int comando2 = keyboard.nextInt();
		System.out.print("Insira o numero a ser localizado na composicao(Y): ");
		int comando3 = keyboard.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.clear();
		int count = 1;
		int maxContagem = 0;
		System.out.println("Os numeros são:");

		while (maxContagem < comando) {
			int aux = count * 10;
			int adiciona = 0;
			while (aux != 0) {
				if (adiciona == comando2) {
					System.out.print(count + " - ");
					aux = 0;
					maxContagem++;
				}
				aux = aux / 10;
				if (aux % 10 == comando3) {
					adiciona++;
				}
			}
			count++;
		}
	}

}



