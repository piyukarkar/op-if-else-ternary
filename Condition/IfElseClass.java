package Condition;

public class IfElseClass {
    int noOfPatels =5;
		
		if (noOfPatels % 2 ==0) {
			
			System.out.println("He Loves me not");
		}else {
	    System.out.println("He loves me");
		
		
		
		int number = 23;
		
		if(number<=10) {
			System.out.println("Number is less than 10");
	
		} else if(number>10 && number <= 20) {
			System.out.println("Number is greater than 10 and Less than 20");
			
		}else if(number >20 && number<=30) {
			System.out.println("Number is greater than 20 and  Less than 30");
		}else {
			System.out.println("Number is greater than 30" );
		}
		
		
		int a = 115;
		int b = 82;
		int maxOfBothNumbers = 0;
		
		if(a>b) {
		 maxOfBothNumbers = a;
		System.out.println("max number is" +  maxOfBothNumbers);	
		}else {
			maxOfBothNumbers = b;
			System.out.println("Number is " + maxOfBothNumbers);	
		}
		
		}
}
