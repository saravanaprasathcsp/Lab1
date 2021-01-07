/*Create a method to check if a number is an increasing number
   * @arthur 
   * Saravana prasath
   * 
   * */

package lab1exercises;

public class Exercise7 {

	public static void main(String[] args) {
		int n=4556799;
	boolean f=increasingnumber(n);
	if(f)
	{
	System.out.println("It is an increasing number");
	}
	else
	{
		System.out.println("It is not an increasing number");
	}

	}
	public static boolean increasingnumber(int n)
	{
		int d,r=0;
	boolean flag=false;
	while(n>0)
	{
		d=n%10;
		n=n/10;
		r=n%10;
		if(!(d>=r))
		{
			return flag;
		}
	}
	return true;		
	}

}
