import java.util.Scanner;

public class Day_06_Review {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        
        
        for (int i = 0; i < a; i++) {
            String str = scanner.nextLine();
            
            for (int j = 0; j < str.length(); j+=2) {
                System.out.print(str.substring(j, j+1));
            }
            System.out.print(" ");
            
            for (int h = 1; h < str.length(); h += 2) {
                System.out.print(str.substring(h, h+1));
            }
            System.out.println("");
            
        }

    }
}
