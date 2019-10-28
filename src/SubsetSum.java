/*
Takes into standard input a comma separated list of inputs (weights) on the first line and a weight limit W on the second line
eg input file:
5, 10, 12, 7, 15, 13, 8, 25
21

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {
	
	private Integer[][] opt;
	private Integer[] weights;
	private Integer W; // weight limit
	
	public static void main(String[] args){

		// READ INPUT FROM STANDARD IN
		
		Scanner stdin = new Scanner(System.in);
		String weightsStr = stdin.nextLine();
		int W = stdin.nextInt();
		stdin.close();
		
		Scanner lineScanner = new Scanner(weightsStr);
		lineScanner.useDelimiter("(,\\s)|\\s");
		ArrayList<Integer> weightsArrayList = new ArrayList<Integer>();
		while(lineScanner.hasNextInt())
			weightsArrayList.add(lineScanner.nextInt());
		lineScanner.close();
		
		Integer[] weights = new Integer[weightsArrayList.size()];
		weightsArrayList.toArray(weights);
		
		SubsetSum sm = new SubsetSum(weights, W);
		sm.findOpt();
		System.out.println(Arrays.toString(weights));
		
	}
	
	public SubsetSum(Integer[] weights, Integer W){
		this.weights = weights;
		this.W = W;
	}
	
	public void findOpt(){
		
	}
	
}
