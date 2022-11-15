package Leetcode;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.next();
		String output=reverseWords(s);
		System.out.println(output);
	}
	private static String reverseWords(String s) {
		StringBuilder sb=new StringBuilder();
		String words[]=s.split("\\s+");
		for(int index=words.length-1;index>=0;index--) {
			sb.append(words[index]).trimToSize();
			sb.append(" ");
		}
        return sb.toString().trim();
    }
}
