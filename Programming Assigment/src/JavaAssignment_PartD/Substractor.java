package JavaAssignment_PartD;

import java.util.Calendar;
import java.util.Date;

public class Substractor extends Mathematician {

	Substractor(int num_1, int num_2, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.timeRequested= new Date(timeRequeste);

	}

	public Substractor(int num_1, int num_2, int num_3, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
		this.timeRequested= new Date(timeRequeste);

	}

	@Override
	public void subtract(int num1, int y) {

		this.result = this.num1 - this.num2;
		this.responseTime = new Date().getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);

	}

	public void subtract(int num1, int num2, int num3) {

		this.result = this.num1 - this.num2 - this.num3;
		responseTime = new Date().getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);
	}

	@Override
	public void multiply(int x, int y) {
		// TODO Auto-generated method stub
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
	}

}