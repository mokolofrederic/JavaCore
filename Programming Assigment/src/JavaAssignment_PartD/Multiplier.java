package JavaAssignment_PartD;

import java.util.Calendar;
import java.util.Date;

public class Multiplier extends Mathematician {

	public Multiplier(int num_1, int num_2, long timeRequeste) {

	this.num1 = num_1;
	this.num2 = num_2;
	this.timeRequested= new Date(timeRequeste);

	
	}

	Multiplier(int num_1, int num_2, int num_3, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
		this.timeRequested= new Date(timeRequeste);

	}

	@Override
	public void multiply(int x, int y) {
	
		
		this.result = this.num1 * this.num2; 
		
		this.responseTime = new Date().getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);		
		
		
		}

	public void multiply(int x, int y, int z){
		this.result = this.num1*this.num2*this.num3; 
		
		this.responseTime = new Date().getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);
	}


	@Override
	public void add(int x, int y) {
		
	}



	@Override
	public void divide(int x, int y) {
		
	}

	@Override
	public void subtract(int x, int y) {
		
	}



}