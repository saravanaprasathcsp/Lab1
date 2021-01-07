/*The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
  *  @arthur 
	* Saravana prasath
	*
	*  */
		
		package lab1exercises;

public class Exercise3 {

	public static void main(String[] args) {
		int n=10;
		fibonacci(n);
	
	}
	public static void fibonacci(int n)
	{
		int a=1;
		int b=1;
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
