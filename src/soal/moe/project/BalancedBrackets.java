package soal.moe.project;

import java.lang.reflect.Array;

public class BalancedBrackets {
	
	boolean getBalanceStatus (String[] arr) {
		boolean balance = true;
		for(int i = 0; i < (arr.length)/2; i++) {
			if (arr[arr.length-(i+1)].equals(")")) {
				balance = true;
			} else if (arr[arr.length-(i+1)].equals("]")) {
				balance = true;
			} else if (arr[arr.length-(i+1)].equals("}")) {
				balance = true;
			} else {
				balance = false;
			}
		}
		
		return balance;
	}
	
	public static void main (String[] args) {
		BalancedBrackets balance = new BalancedBrackets(); 
		String s = "{[()]}";
	    String[] arr = s.split("");
	    boolean getBalanceStatus = balance.getBalanceStatus(arr);
	    
	    if (getBalanceStatus != true) {
	    	System.out.println("NO");
	    } else {
	    	System.out.println("YES");
	    }
	    
	}
}
