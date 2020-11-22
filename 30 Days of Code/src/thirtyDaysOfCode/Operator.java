package thirtyDaysOfCode;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double mealCost = scanner.nextDouble(); //takes the meal cost
		
		int tipPercent = scanner.nextInt(); //takes tip percent
		
		int taxPercents = scanner.nextInt(); // takes tax percent
		
		double totalCost = (mealCost * tipPercent / 100) + (mealCost * taxPercents / 100) + mealCost; //calculates the total cost as double
		
		int totalcost = (int) (totalCost + 0.5); // rounds the total cost. you can also use Math.round() but this works for me.
		
		System.out.println(totalcost); // print the rounded value of total cost;
		
		
	}

}