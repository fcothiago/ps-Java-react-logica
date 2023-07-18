package Desafio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public final class Desafio3 {
	
	/*
	 * If target is included in a ordered array, returns the index
	 * If not, returns -1
	 * */
	private static int find(List<Integer> numbers,int target) {
		int lower = 0;
		int upper = numbers.size();
		while(upper != lower) {
			int index = (upper+lower)/2;
			int value = numbers.get(index);
			if(value == target)
				return index;
			else if(value > target)
				upper = index;
			else
				lower = index+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		
		List<Integer> numbers  = new ArrayList();
		
		for(int i = 0; i < n ; i++) {
			numbers.add(in.nextInt());
		}
		
		
		numbers.sort(null);
		
		int pairs = 0;

		while(numbers.size() > 0) {
			
			int value = numbers.remove(0);
			int index_1 = find(numbers,value-k); // k = value - number.get(index_1) 
			int index_2 = find(numbers,value+k); // k = number.get(index_2) - value
			
			if(index_1 >= 0) {
				pairs++;
			}
			
			if(index_2 >= 0){
				pairs++;
			}

		}

		System.out.println(pairs);
		
	}

}
