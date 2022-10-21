package Leetcode;

import java.util.Scanner;

public class ExcelSheetColumnTitle_168 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		String output=convertToTitle(no);
		System.out.println(output);
	}
	 public static String convertToTitle(int columnNumber) {
	        StringBuilder s=new StringBuilder();
	        while(columnNumber>0){
	        	columnNumber--;
	            char c=(char)((columnNumber%26)+'A');
	            s.append(c);
	            columnNumber=columnNumber/26;
	        }
	        return s.reverse().toString();
	    }

}
