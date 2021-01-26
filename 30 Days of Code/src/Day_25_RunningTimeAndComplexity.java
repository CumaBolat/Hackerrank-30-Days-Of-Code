import java.util.*;

public class Day_25_RunningTimeAndComplexity {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            
            if (isPrime(num)) {
                
                System.out.println("Not prime");
                
            } else {
                System.out.println("Prime");
            }
            
        }     
    }
    
    
    static boolean isPrime(int n) {
        if (n == 1) return true;
        
        
        for (int i = 2; i * i <= n; i++) {
            
            if (n % i == 0) {
                return true;
            }
        }
        
        return false;
    }
}
