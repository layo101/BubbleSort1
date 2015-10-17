package bubblesortalgorithm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defines an array that has space to hold 5 integers
		int[] num = new int[5];
		
		// defines a primitive int 
		int size = 5;
		int tmp = 0;
		
		//Reads integer value from the standard input
		Scanner read = new Scanner (System.in);
		
		//Prints to the screen
		System.out.println("Enter 5 numbers: ");
		
		for (int i = 0; i <= size-1; i++)
		{
			//reads in the value from the standard input
			num[i] = read.nextInt();
			
		}
		/*
		for(int j = 0; j < num.length; j++)
		{
			//prints the numbers entered out to screen
			System.out.println(num[j]);	
		}
		*/
		
		//Algorithm for Bubble sorting
		for(int k = 0; k < num.length-1; k++){
			for(int l = 0; l < num.length-1-k; l++){
				if(num[l] > num[l+1]){
					tmp = num[l+1];
					num[l+1] = num[l];
					num[l] = tmp;
				}						
			}
		}
		
		// prints the bubble sorted numbers to the screen
		for (int m = 0; m < num.length; m++){
			System.out.println(num[m]);
		}
	
	}

}
