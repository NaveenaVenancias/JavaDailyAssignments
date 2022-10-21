package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber_202 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean output=isHappy(no);
		System.out.println(output);
	}
	
	public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
        	set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

	 private static int getNext(int n) {
	        int sum = 0;
	        while (n > 0) {
	            int temp = n % 10;
	            n = n / 10;
	            sum =sum+(temp*temp);
	        }
	        return sum;
	 }
}
/*
			while(temp!=0) {
				digit=temp%10;
				sum1=sum1+(digit*digit);
				temp=temp/10;
			}
			while(sum1!=0) {
				digit=sum1%10;
				sum2=sum2+digit;
				sum1=sum1/10;
			}
			if(sum2==1) {
				value=true;
			}
*/
