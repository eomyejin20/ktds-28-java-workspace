package workflow;

import java.util.Scanner;

public class IfQuiz3 {
	
	public static void main(String[] args) {
		
		int n = 0;
		int k = 0;
		
		int sheep = 0;
		int drink = 0;
		
		int price = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		n = keyboard.nextInt();
		k = keyboard.nextInt();
		
		sheep = 12000 * n;
		drink = 2000*k;
		
		price = sheep + drink;
		
		if (n >= 10) {   
			price -= (n / 10) * 2000;
		}
		System.out.println(price);
		
	}

}
