package Desafio1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public final class Dasafio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		List<Integer> odds  = new ArrayList();
		List<Integer> evens = new ArrayList();

				
		for(int i = 0; i < size;i++) {
			Integer number = in.nextInt();
			if(number % 2 == 0)
				evens.add(number);
			else
				odds.add(number);
		}
		
		odds.sort(null);
		evens.sort(null);
		
		for(int i = 0; i < evens.size(); i++)
			System.out.println(evens.get(i));
		
		for(int i = odds.size() - 1; i >= 0; i--)
			System.out.println(odds.get(i));
	}

}
