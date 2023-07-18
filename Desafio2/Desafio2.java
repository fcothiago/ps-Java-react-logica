package Desafio2;
import java.util.Scanner;

public final class Desafio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double value =  in.nextDouble(); 
		
		int integer_part = (int) Math.floor(value);
		int decimal_part = (int) ( (value - integer_part)*100 );
		
		int [] banknotes = new int[6]; 
		int [] coins = new int[6]; 
		int temp = decimal_part;
		
		//Getting bank notes
		
		banknotes[0] = integer_part/100;
		integer_part = integer_part%100;
		
		banknotes[1] = integer_part/50;
		integer_part = integer_part%50;
		
		banknotes[2] = integer_part/20;
		integer_part = integer_part%20;
		
		banknotes[3] = integer_part/10;
		integer_part = integer_part%10;
		
		banknotes[4] = integer_part/5;
		integer_part = integer_part%5;
		
		banknotes[5] = integer_part/2;
		integer_part = integer_part%2; // If integer part is not 0, that means that are one coin left.
		
		//Getting coins
		
		coins[0] = decimal_part/100 + integer_part;
		decimal_part = decimal_part%100;
		
		coins[1] = decimal_part/50;
		decimal_part = decimal_part%50;
		
		coins[2] = decimal_part/25;
		decimal_part = decimal_part%25;
		
		coins[3] = decimal_part/10;
		decimal_part = decimal_part%10;
		
		coins[4] = decimal_part/5;
		decimal_part = decimal_part%5;
		
		coins[5] = decimal_part;
		
		//Printing
		
		System.out.println("Notas: ");
		
		System.out.println(banknotes[0]  + " notas de R$ 100 ");
		System.out.println(banknotes[1]  + " notas de R$ 50 ");
		System.out.println(banknotes[2]  + " notas de R$ 20 ");
		System.out.println(banknotes[3]  + " notas de R$ 10 ");
		System.out.println(banknotes[4]  + " notas de R$ 5 ");
		System.out.println(banknotes[5]  + " notas de R$ 2 ");
		
		System.out.println("Moedas: " + temp);
		
		System.out.println(coins[0]  + " moedas de R$ 1.00 ");
		System.out.println(coins[1]  + " moedas de R$ 0.50 ");
		System.out.println(coins[2]  + " moedas de R$ 0.25 ");
		System.out.println(coins[3]  + " moedas de R$ 0.10 ");
		System.out.println(coins[4]  + " moedas de R$ 0.05 ");
		System.out.println(coins[5]  + " moedas de R$ 0.01 ");

	}
}
