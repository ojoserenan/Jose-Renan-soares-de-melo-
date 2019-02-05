package Operacao;
import java.util.Scanner;
public class Adicao extends Operacao {
	private Scanner ler;
	public void operacao() {
		ler = new Scanner(System.in);
		float num1;
		float num2;
		num1 = ler.nextFloat();
		num2 = ler.nextFloat();
		float operacao = num1 + num2;
		System.out.println(operacao);
		
	}	
}
