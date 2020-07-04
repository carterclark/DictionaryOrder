package misc;

import java.util.Scanner;
import java.util.Arrays;

public class DictionaryOrder {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);//scanner
		System.out.println("Enter: ");
		int len = input.nextInt(); //length of array
		int i;
		
		String[] arr = new String[len];	//initializing array of length len
		for(i=0; i<len; i++) {
			System.out.println("Enter element of array: ");
			String element = input.next(); //elements in array
			
			if(i==(len-1)) input.close();	//closes input
			
			arr[i] = element;
		}
		input.close();
		
		String[] result = alphabetize(arr, len);
		System.out.print(Arrays.toString(result));
	}
	
	
	
	
	
	//method to alphabetize array
	static String[] alphabetize(String[] arr, int len) {
		String temp;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
