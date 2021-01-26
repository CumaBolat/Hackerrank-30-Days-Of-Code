import java.util.Scanner;

public class Day_05_Loops {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        
    }
}
