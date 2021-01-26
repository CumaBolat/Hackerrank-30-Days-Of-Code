import java.util.*;

public class Day_10_BinaryNumbers {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        
        String a = Integer.toBinaryString(n);
        
        char[] arr = new char[a.length()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.charAt(i);
        }
        
        int max = 0;
        int current = 0;
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '1') {
                current++;
                if (current > max) {
                    max = current;
                    
                }
            } else {
                current = 0;
            }
        }
        System.out.println(max);
         
    }
}
