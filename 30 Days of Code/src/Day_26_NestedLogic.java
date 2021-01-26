import java.util.*;

public class Day_26_NestedLogic {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        if (y1 > y2) {
            System.out.println(10000);
        }else if (m1 > m2 && d1 > d2 && y1 < y2) {
            System.out.println(0);
        }else if (m1 > m2) {
            System.out.println((m1 - m2) * 500);
            
        }else if (d1 > d2 && m1 == m2) {
            System.out.println((d1 - d2) * 15);

        } else {
            System.out.println(0);
        }   
    }
}
