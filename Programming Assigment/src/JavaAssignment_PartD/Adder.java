package JavaAssignment_PartD;

import java.io.*;
import java.util.*;



import java.util.Calendar;
import java.util.Date;

public class Adder extends Mathematician {

	Adder(int num_1, int num_2, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;

		this.timeRequested= new Date(timeRequeste);
	}

	Adder(int num_1, int num_2, int num_3, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
		this.timeRequested= new Date(timeRequeste);
	}

	@Override
	public void add(int x, int y) {

		this.result = this.num1 + this.num2; 
		
		 this.responseTime = (int) (Calendar.getInstance().get(Calendar.SECOND)-timeRequested.getSeconds() );

		 print(result,responseTime); 
	}
	
	public void add(int num1, int num2, int num3) {

		this.result = this.num1 + this.num2+this.num3; 
		
		//subtract responseTime from current time and then print it 
		 this.responseTime = (int)(Calendar.getInstance().get(Calendar.SECOND)-timeRequested.getSeconds() );
		 print(result,responseTime); 

	}

	@Override
	public void multiply(int x, int y) {
	}

	@Override
	public void divide(int x, int y) {
		
	}

	@Override
	public void subtract(int x, int y) {
		
	}



	

}