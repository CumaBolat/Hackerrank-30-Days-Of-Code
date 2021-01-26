import java.util.Scanner;

public class Day_02_Operators {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double mealCost = scanner.nextDouble();
        
        int tipPercent = scanner.nextInt();
        
        int taxPercents = scanner.nextInt();
        
        double totalCost = (mealCost * tipPercent / 100) + (mealCost * taxPercents / 100) + mealCost;
        
        int totalcost = (int) (totalCost + 0.5);
        
        System.out.println(totalcost);
        
        
    }
}
