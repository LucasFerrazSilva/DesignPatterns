package br.com.ferraz.designpatterns.main;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {		
		try(Scanner scanner = new Scanner(System.in)) {
			String[] valoresString = leConsole(scanner);
			
			int[] valores = new int[valoresString.length];
			int [] pares = new int[valoresString.length];
			int [] impares = new int[valoresString.length];			
			
			converteParaArrayDeInt(valoresString, valores);
			
			ordenaArray(valores);

			agrupaParesEImpares(valores, pares, impares);
			
			mostraArray("Array ordenado: ", valores);
			mostraArray("Pares: ", pares);
			mostraArray("Ímpares: ", impares);
		}
	}


	private static String[] leConsole(Scanner scanner) {
		System.out.print("Digite os valores (separando com ,): ");
		
		return scanner.nextLine().split(",");
	}

	private static void converteParaArrayDeInt(String[] valoresString, int[] valores) {
		for(int i = 0; i < valoresString.length; i++) {
			valores[i] = Integer.parseInt(valoresString[i]);
		}
	}

	private static void ordenaArray(int[] valores) {
		for(int i = 0; i < valores.length - 1; i++) {
			for(int j = i + 1; j < valores.length ; j++) {
				if(valores[j] < valores[i]) {
					int temp = valores[i];
					valores[i] = valores[j];
					valores[j] = temp;
				}
			}
		}
	}

	private static void agrupaParesEImpares(int[] valores, int[] pares, int[] impares) {
		int iPares = 0;
		int iImpares = 0;
		
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] % 2 == 0)
				pares[iPares++] = valores[i];
			else
				impares[iImpares++] = valores[i];
		}
	}
	
	private static void mostraArray(String mensagem, int[] array) {
		System.out.print(mensagem);
		
		for(int i = 0; i < array.length && (i==0 || array[i] > array[i-1]) ; i++) {
			if(i > 0)
				System.out.print(", ");
			
			System.out.print(array[i]);
		}
		
		System.out.println();		
	}
	
}
