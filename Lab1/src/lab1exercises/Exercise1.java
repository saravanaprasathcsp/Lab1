/*Create a method to find the sum of the cubes of the digits of an n digit number
  *@arthur 
  *Saravana prasath
  *
  *  */
package lab1exercises;

public class Exercise1 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(sumofcubes(n));

	}
	public static int sumofcubes(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i*i*i;
			
		}
		return sum;
	}

}
