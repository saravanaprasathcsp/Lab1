/*Create a method to check if a number is a power of two or not
  *@arthur
  *Saravana prasath
  *
  *   */
package lab1exercises;


public class Exercise8 {
	public static void main(String [] args)
	{
		int n=9;
		boolean check=checkNumber(n);
		System.out.print(check);
	}
	public static boolean checkNumber(int n)
	{
		return (int)(Math.ceil((Math.log(n)/Math.log(2))))==(int)(Math.floor(((Math.log(n)/Math.log(2)))));
	}

}