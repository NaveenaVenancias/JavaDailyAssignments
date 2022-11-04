package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz_412 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> list=fizzBuzz(n);
		System.out.println(list);
	}
	private static List<String> fizzBuzz(int n) {
		List<String> list=new ArrayList<String>();
		for(int index=1;index<=n;index++) {
			if((index%3==0)&&(index%5==0)) {
				list.add("FizzBuzz");
			}
			else if(index%3==0) {
				list.add("Fizz");
			}
			else if(index%5==0) {
				list.add("Buzz");
			}
			else {
				list.add(String.valueOf(index));
			}
		}
		
		return list;
	}

}
