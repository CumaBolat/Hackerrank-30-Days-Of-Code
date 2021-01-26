import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference (int[] elements) {
        this.elements = elements;
    }
    
    void computeDifference() {
        this.maximumDifference = Integer.MIN_VALUE;
        for (int i = 0; i < this.elements.length - 1; i++) {
            
            for (int j = i + 1; j < this.elements.length; j++) {
                if (Math.abs(this.elements[i] - this.elements[j]) > this.maximumDifference) {
                    this.maximumDifference = Math.abs(this.elements[i] - this.elements[j]);
                }
            }
            
        }
        
    }
} 

public class Day_14_Scope {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
