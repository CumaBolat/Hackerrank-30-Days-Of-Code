package thirtyDaysOfCode;

import java.util.*;

public class DataTypes {

	public static void main(String[] args) {
		
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        
        int a = scan.nextInt();
                
        double b = scan.nextDouble();        
        
        scan.nextLine(); //If you use the nextLine() method immediately following 
        				//the nextInt() (or nextDouble()) method, recall that nextInt() reads integer tokens, because of this, the last 
        				//newline character for that line of integer input is still queued in the input buffer and the next nextLine() 
        				//will be reading the remainder of the integer line (which is empty). So we have to make a dummy call to nextLiner().
        
        String c = scan.nextLine();
        
        System.out.println(a + i);
        
        System.out.println(b + d);
        
        System.out.println(s + c);				
		        
	}

}
