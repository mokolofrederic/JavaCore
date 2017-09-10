package JavaAssignment_PartA;

import java.util.Scanner;

public class Array {

	public static void getIndex(int[] s, int x){
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("please enter an index");
		
		int index = sc.nextInt(); 
		
		try{ 
			System.out.println(s[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println(e.getClass());
		}
		
		
	}
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the number of elements in the array");
		int numElements = sc.nextInt();  

		
		int a[] = new int[numElements]; 
		
		for(int x=0; x<numElements; x++)
		{
			a[x] = sc.nextInt(); 
		}
		
		
		//int b[] = {2, 4, 2, 299, 34}; 
		
		getIndex(a, numElements); 
		
	}

}