/*Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
  *@arthur 
  * Saravana prasath
  * 
  * */

package lab1exercises;

public class Exercise5 {

	public static void main(String[] args) {
		int n=10;
		System.out.println(sumofnaturalnumber(n));
		}
	public static int sumofnaturalnumber(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				sum+=i;
			}else if(i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
