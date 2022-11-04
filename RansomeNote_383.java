package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class RansomeNote_383 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ransomNote=sc.next();
		String magazine=sc.next();
		boolean value=canConstruct(ransomNote, magazine);
		System.out.println(value);
	}
	private static boolean canConstruct(String ransomNote, String magazine) {
        boolean value=true;
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(char c:magazine.toCharArray()) {
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)+1);
        	}
        	else {
        		map.put(c, 1);
        	}
        }
        for(char c:ransomNote.toCharArray()) {
        	if((map.containsKey(c))&&(map.get(c)!=0)) {
        		map.put(c, map.get(c)-1);
        	}
        	else {
        		value=false;
        	}
        }
                
        return value;
    }
}
