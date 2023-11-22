package problemnfvs;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count = 0;
		int sum = 0;
		
		int input = 0;
		while (true) {
			System.out.println("Enter numbers");

			input = in.nextInt();

			if (input < 0) {
				System.out.println("You're Out");
				break;
			}

			if (input == 0) {

				if (count > 0) {
					double avg = (double) sum / count;
					System.out.println("The max is " + max);
					System.out.println("The min is " + min);
					System.out.println("The average is " + avg);
				}
			} else {
				max = Math.max(max, input);
				min = Math.min(min, input);
				sum += input;
				count++;

			}
		}
		
		double avg = (double) sum / count;
		System.out.println("The max is " + max);
		System.out.println("The min is " + min);
		System.out.println("The average is " + avg);

		in.close();

	}

}
