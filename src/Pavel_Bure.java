/**

 *

 * Name: Dylan Fyvie

 * Teacher: Mr.Hardman

 * Assignment #4, Program #2

 * Date Last Modified: 11/15/2016

 *

 */

/**
 * 
 */

/**
 * @author d.fyvie
 *
 */
import java.util.Scanner;

public class Pavel_Bure {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner userInput = new Scanner(System.in);
		
   	double userNum;
	double userNumRoot;
		
		do{
			System.out.println("Please enter a Positive Number");
			userNum = userInput.nextInt();
		
			userNumRoot = Math.sqrt(userNum);
		
		
			if (userNum < 0){
			System.out.println("Please Enter A Valid Number");
			}
			
		
		
		 
		
			

		}while(userNum<0);
		System.out.println("Your Numbers Square Root Is: " + userNumRoot);
		
		
		userInput.close();

	}
}
	