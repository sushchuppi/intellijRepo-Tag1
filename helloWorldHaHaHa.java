package learnJava;
import java.math.*;


public class helloWorldHaHaHa {
public static void main (String [] args) {
	
	// print new line
	System.out.println("Hello World it sucks");
	System.out.println(2*3.2+5.8888);
	final int myNum=143;
	int x=16;
	float y= x+myNum;
	System.out.println(y);
	
	// switch cases 
	switch(x) {
	case 1:
		System.out.println("A was executed for X");
		break;
	case 2:
		System.out.println("B was executed for X");
	default:
		System.out.println("break here");
		break;
	}
	
	// Multidimensional array
	int[][] myNumbers = new int[4][3];
//	myNumbers[][]= { {1, 2, 3, 4}, {5, 6, 7} };
	System.out.println(myNumbers[1][2]); // Outputs 7
	
}

}


