import java.io.*;
import java.util.*;
import java.lang.Math;
public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("enter the value of x");
		Scanner s = new Scanner(System.in);
		float x = s.nextFloat();
	     float guess = x/2;
		while(Math.abs((guess*guess) - x)<=Math.pow(10,-12)) {
			System.out.println(guess);
			
			
		}
		guess = (guess + (x/guess))/2;
		System.out.println(guess);
		


	}

}
