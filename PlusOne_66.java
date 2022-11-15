package Leetcode;

import java.util.Scanner;

public class PlusOne_66 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		int digits[]=new int[n];
		for(int index=0;index<n;index++) {
			digits[index]=sc.nextInt();
		}
		int output[]=plusOne(digits);
		for(int index=0;index<output.length;index++) {
			System.out.print(output[index]);
		}
		
	}
	private static int[] plusOne(int[] digits) {
		
		for(int index=digits.length-1;index>=0;index--) {
			if(digits[index]<9) {
				digits[index]=digits[index]+1;
				break;
			}
			else if((digits[index]==9)&&(index!=0)) {
				digits[index]=0;
			}
			else if((digits[index]==9)&&(index==0)) {
				digits=new int[digits.length+1];
				digits[0]=1;
			}
		}
		
        return digits;
    }
}
