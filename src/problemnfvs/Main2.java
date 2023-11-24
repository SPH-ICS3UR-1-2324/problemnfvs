package problemnfvs;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(true) {
			System.out.println("menu");
			System.out.println("1: Enter a value");
			System.out.println("2: See max, min, average");
			System.out.println("3: Quit");
			
			System.out.println("Enter your choice:");
			
			int choice = in.nextInt();
		
			switch (choice) {
			case 1: 
				System.out.println("Enter a number");
				int userInput = in.nextInt();
				if(userInput>=0) {
					max=Math.max(max, userInput);
					min=Math.min(min,userInput);
					Object userIput = in;
					Object sum = userIput;
					int count = 0;
					count++;
				}else {
					System.out.println("Negative number entered. Exiting program");
					return;
				}
				break;
			case 2:
			}
			 int input = in.nextInt();
				
		}
	}

}
