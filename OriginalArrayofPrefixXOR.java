package Leetcode;

import java.util.Scanner;

public class OriginalArrayofPrefixXOR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int input[]=new int[n];
		for(int index=0;index<n;index++) {
			input[index]=sc.nextInt();
		}
		int output[]=findArray(input);
		for(int index=0;index<n;index++) {
			System.out.print(output[index]);
		}
	}
	private static int[] findArray(int[] pref) {
		
		int temp=pref[0];
		for(int index=1;index<pref.length;index++) {
			pref[index]=pref[index]^temp;
			temp=temp^pref[index];
		}
		
		return pref;
    }
}
