package claseED;

import java.util.Scanner;

public class _174 {
	//Ejercicio 174, anyo 2013
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int num = tec.nextInt();

		boolean repetido = cuantosRepetidos(String.valueOf(num));
		boolean repetido2 = repetido;
		int numV2 = num;
		int anyoMenor = -1;

		while (repetido2 == repetido) {
			repetido2 = cuantosRepetidos(String.valueOf(numV2));
			if (repetido2 == repetido) {
				numV2--;
				anyoMenor++;
			}
		}

		numV2 = num;
		repetido2 = repetido;
		int anyoMayor = 0;

		while (repetido2 == repetido) {
			repetido2 = cuantosRepetidos(String.valueOf(numV2));
			if (repetido2 == repetido) {
				numV2++;
				anyoMayor++;
			}
		}
		int primerAnyo = num - anyoMenor;
		int longSerie = anyoMayor + anyoMenor;
		System.out.println(primerAnyo + " " + longSerie);
	}

	public static boolean cuantosRepetidos(String num) {
		for (int i = 0; i < num.length() - 1; i++) {
			for (int j = i + 1; j < num.length(); j++) {
				if (num.charAt(i) == num.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
