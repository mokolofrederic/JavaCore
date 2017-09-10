package JavaAssignment_PartD;

import java.util.Date;

public abstract class Mathematician {

	protected int num1;
	protected int num2;
	protected int num3;
	protected int result;
	protected int responseTime;
	
	Date timeRequested; 

	public abstract void add(int x, int y);
	public abstract void multiply(int x, int y);
	public abstract void divide(int x, int y);

	public abstract void subtract(int x, int y);

	
	public void print(int result, int time){
		
		
		
		
		System.out.println("The answer to your inquiry is " + result);
		System.out.println("Response time: "  + time + " seconds.");
	}
	public void subtract() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}