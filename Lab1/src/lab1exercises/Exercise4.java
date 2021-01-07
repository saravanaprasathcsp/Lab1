/*Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
  *
  *@arthur 
  *Saravana prasath
  *
  **/

package lab1exercises;

public class Exercise4 {
	public static void main(String[] args)
	{
		int num=25;
		
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<=2)
				System.out.println(i);
		}
	}

}