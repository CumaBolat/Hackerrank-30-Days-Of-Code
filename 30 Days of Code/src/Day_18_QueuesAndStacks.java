import java.io.*;
import java.util.*;

public class Day_18_QueuesAndStacks {
	Stack<Character> stack = new Stack<>();
    Queue<Character> que = new LinkedList<>();

    void pushCharacter(char ch) {
        stack.push(ch); 
    }
    void enqueueCharacter(char ch) {
        
        que.add(ch);
    }
    
    char popCharacter() {
        
        return stack.pop();
        
    }
    char dequeueCharacter() {
        return que.remove();
        
    }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_QueuesAndStacks p = new Day_18_QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
