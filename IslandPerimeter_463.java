package Leetcode;

import java.util.Scanner;

public class IslandPerimeter_463 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Rows: ");
		int n=sc.nextInt();
		System.out.println("Enter no of Columns: ");
		int m=sc.nextInt();
		int input[][]=new int[n][m];
		System.out.println("Enter the values: ");
		for(int index=0;index<n;index++) {
			for(int innerIndex=0;innerIndex<m;innerIndex++) {
				input[index][innerIndex]=sc.nextInt();
			}
		}
		int output=islandPerimeter(input);
		System.out.println(output);
	}
	private static int islandPerimeter(int[][] grid) {
		int output=0;
		for(int index=0;index<grid.length;index++) {
			for(int innerIndex=0;innerIndex<grid[0].length;innerIndex++) {
				if(grid[index][innerIndex]==1) {
					output=output+4;
					if((index>0)&&(grid[index-1][innerIndex]==1)) {
						output=output-2;
					}
					if((innerIndex>0)&&(grid[index][innerIndex-1]==1)) {
						output=output-2;
					}
				}
			}
		}
		return output;
    }
}
