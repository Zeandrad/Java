package EntradadeDados;

import java.util.Scanner;

public class EntradadeDados_Float {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char x;
		x= sc.next().charAt(20);

		System.out.println("Você digitou: " + x);

		sc.close();

	}

}