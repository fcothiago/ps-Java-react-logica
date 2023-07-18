package Desafio4;
import java.util.Scanner;

public final class Desafio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String [] lines = new String [n];
		
		in.nextLine();
		
		for(int i = 0; i < n ; i++){
			
			byte [] line = in.nextLine().getBytes();
			
			lines[i] = "";
			
			for(int j = line.length/2-1; j >= 0 ; j--){
				lines[i] += (char) line[j] ;
			}
			
			for(int j = line.length - 1; j >= line.length/2 ; j--){
				lines[i] += (char) line[j] ;
			}

		}
		for(int i = 0; i < n ; i++)
			System.out.println(lines[i]);
	}

}
