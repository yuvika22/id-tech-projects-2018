/**  import java.util.Scaner;
 * 
 */

/**
 * @author iD Student
 *
 */
 import java.util.Random;
import java.util.Scanner;
public class PrintStuff {

	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Hello World");
		System.out.println (4);
		System.out.println (2.7);
		if(2<4)
		System.out.println ("True");
		scan = new Scanner(System.in);
		System.out.println (scan.nextLine());
		Random generator = new Random();
		int gold;
		gold=generator.nextInt(100);
		System.out.println(gold);
		
		
	
	
	
	}


}
