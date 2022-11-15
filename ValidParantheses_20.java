package Leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.next();
		boolean output=isValid(s);
		System.out.print(output);
	}
	private static boolean isValid(String s) {
        boolean output=false;
        Stack<Character> stack=new Stack<Character>();
        for(char c: s.toCharArray()) {
        	if((c=='(')||(c=='[')||(c=='{')) {
        		stack.push(c);
        		continue;
        	}
        	if(!stack.isEmpty()) {
        		if((c==')')&&(stack.peek()=='(')) {
        			stack.pop();
        			continue;
        		}
        		else if((c==']')&&(stack.peek()=='[')) {
        			stack.pop();
        			continue;
        		}
        		else if((c=='}')&&(stack.peek()=='{')) {
        			stack.pop();
        			continue;
        		}
        		else {
        			stack.push(c);
        		}
        	}
        	if(stack.isEmpty()) {
        		stack.push(c);
        	}
        }
        if(stack.isEmpty()) {
        	output=true;
        }
        
        return output;
    }
}
