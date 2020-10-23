package Condition;

public class SwitchCase {
    public static void main(String[] args) {
		
		int dayOfWeek = 2;
		
		
		switch(dayOfWeek) {
		case 1:

		case 2:
			System.out.println("I'm in leave");
			break;
		case 3:
			System.out.println("I'm playing football");
			break;
			
			default:
				System.out.println("I don't know what day it is");
		}
		
		
		int rating = 4;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad review");
			break;
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:
			System.out.println("Good review");
			break;
		}
	}
}
