package com.cwa.learn1;

public class Code_Text33 {
	public static boolean contains23(int number2) {
		boolean b4 = false;
		boolean	  b5 = false;
			    while (number2 > 0) {
			        int r = number2 % 10;
			        number2 /= 10;
			        if (r == 4)
			            b4 = true;
			        if (r == 5)
			            b5 = true;
			    }
			    if (b4 == true && b5 == true)
			        return true;
			    else
			        return false;
	}

	public static void main(String[] args) {

	}
}
