import java.util.*;

public class Day_16_Exceptions {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        
        try {
            int s = Integer.parseInt(S);
            
            System.out.println(s);
        } catch (Exception a) {
            System.out.println("Bad String");
        }
    
    
    }
}
