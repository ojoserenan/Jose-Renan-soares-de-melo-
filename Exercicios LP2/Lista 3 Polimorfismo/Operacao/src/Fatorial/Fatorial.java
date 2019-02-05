package Fatorial;

import java.util.Scanner;

public interface Fatorial {
	public default void fatorial() {
		Scanner ler = new Scanner(System.in);
		int n;
		n = ler.nextInt();
		int fatorial = 1;
		for (int i = 2; i <= n ; i++) {
		fatorial = fatorial * i;
		}
		System.out.println(fatorial);
	}
}
