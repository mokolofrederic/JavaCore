package JavaAssignment_PartD;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class InputCollector {

	long timeRequested;
	int num1;
	int num2;
	int num3;

	InputCollector() {

		timeRequested = Calendar.getInstance().get(Calendar.MILLISECOND);
	}

	void collectInput() throws IOException {

		Scanner sc = new Scanner(System.in);
		FileWriter file = new FileWriter("MathematiciansLogBook.txt", true);
		

		System.out.println("Please Enter Which of the following you would like to do");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4. Divide");
		int input = sc.nextInt();
		
		System.out.println("please enter two integers");
		this.num1 = sc.nextInt();
		this.num2 = sc.nextInt();

		System.out.println("do you have a third integer? Enter 1 for Yes, Enter 2 for No.");
		int optionThird = sc.nextInt();

		if (optionThird == 1) {
			System.out.println("enter your third integer");
			this.num3 = sc.nextInt();
		}

		switch (input) {

		case 1: //Add.
			if (optionThird == 1) {
				Adder ad = new Adder(num1, num2, num3, timeRequested);
				ad.add(num1,num2, num3);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			} else if (optionThird == 2) {
				Adder ad = new Adder(num1, num2, timeRequested);
				ad.add(num1, num2);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			}
		case 2: //Subtract.
			if (optionThird == 1) {
				Substractor subtr = new Substractor(num1, num2, num3, timeRequested);
				subtr.subtract(num1, num2, num3);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			} else if (optionThird == 2) {
				Substractor subtr = new Substractor(num1, num2, timeRequested);
				subtr.subtract(num1,num2);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			}
		case 3: //Multiply.
			if (optionThird == 1) {
				Multiplier multi = new Multiplier(num1, num2, num3, timeRequested);
				multi.multiply(num1, num2, num3);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			} else if (optionThird == 2) {
				Multiplier multi= new Multiplier(num1, num2, timeRequested);
				multi.multiply(num1, num2);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			}
		case 4: // Divide. 
			if (optionThird == 1) {
				Divider divid = new Divider(num1, num2, num3, timeRequested);
				divid.divide(num1, num2, num3);
				break;
			} else if (optionThird == 2) {
				Divider divid= new Divider(num1, num2, timeRequested);
				divid.divide(num1, num2);
				file.write(Calendar.getInstance().getTime().toString());

				break;
			}

		} // end switch case.


		
		System.gc(); 
		sc.close(); 
		file.close(); 
		
	}

	

	
	
}