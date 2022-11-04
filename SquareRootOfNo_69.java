package Leetcode;

import java.util.Scanner;

public class SquareRootOfNo_69 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int output=mySqrt(x);
		System.out.print(output);
	}
	private static int mySqrt(int x) {
		int left=1;
		int right=x;
		int mid,temp;
		while(left<right) {
			mid=(left+right)/2;
			temp=x/mid;
			if(temp==mid) {
				return mid;
			}
			else if(temp<mid) {
				right=mid;
			}
			else {
				left=mid+1;
			}
		}
        return left-1;
    }

}
