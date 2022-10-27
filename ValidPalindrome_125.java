package Leetcode;

import java.util.Scanner;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		validPalindrome();
	}

	private static void validPalindrome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		StringBuilder output=new StringBuilder();
		for(int index=s.length()-1;index>=0;index--) {
			if(((s.charAt(index)>='a')&&(s.charAt(index)<='z'))||((s.charAt(index)>='A')&&(s.charAt(index)<='Z'))||((s.charAt(index)>='0')&&(s.charAt(index)<='9'))) {
				output.append(s.charAt(index));
			}
		}
		String o1=output.toString();
		String o2=output.reverse().toString();
		System.out.println(o1);
		if(o1.equalsIgnoreCase(o2)) {
			System.out.println("true");
		}
		else System.out.println("false");
	}

}
