package JavaAssignment_PartC;
import java.util.*;

class Number_Program extends Thread{ 
	
	int start; 
	int end; 
	String numberType; 
	 static ArrayList<Integer> numberList;
	
	Number_Program(int star, int en, String numberTyp){
	this.start = star;
	this.end = en;
	this.numberType = numberTyp;
	
	//initialize empty arrayList with null values 
	numberList = new ArrayList<Integer>(); 
}
	@Override
	public void run(){
		if(this.numberType == "ODD")
		for(int x=this.start;x<this.end; x++)
		{
			//add to list if number is odd
			if(x%2==1) numberList.add(x);
		}
		
		else if(this.numberType == "EVEN")
			//add to list if number is even

			for(int x=this.start;x<this.end; x++)
			{
				if(x%2==0) numberList.add(x);
			}
			
		
		
	}
	
	public void display(){
		for(int x : numberList)
		{
			System.out.println(x);
		}
	}
	
}	
	


public class Main_Program {

	public static void main(String[] args) throws InterruptedException {

		
		Number_Program n1 = new Number_Program(30,100,"ODD");
		Number_Program n2 = new Number_Program(0,10,"EVEN");

		
		n1.start(); n2.start();
		
		n1.join(); n2.join();
		
	
		n1.display(); 
	//	n2.display(); 
		
		
	}

}