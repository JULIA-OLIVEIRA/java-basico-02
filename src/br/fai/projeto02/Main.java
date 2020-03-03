package br.fai.projeto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app =  new Main();
		app.start();

	}
	
	private void start () {
		
		System.out.println("digite um valor: ");
		
		Scanner scanner = new Scanner(System.in);
		double valor = scanner.nextDouble();
		
		int  valorComCast = (int) valor; // conversão de valores de forma explicita
		
		System.out.println("o valor com casas: " + valor + " valor inteiro: " + valorComCast);
		
		int novoValor = 10;
		double valorConvertido = novoValor;
		
		System.out.println("novo: " + novoValor + " | valor convertido " + valorConvertido);
		
	}

}
