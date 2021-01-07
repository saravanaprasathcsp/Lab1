/* Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
  *
  *@arthur 
  *  Saravana prasath
  *  
  */

package lab1exercises;

public class Exercise6 {

	public static void main(String[] args) {
		double n=2;
		System.out.println(calculatediffrence(n));
	}
  public static double calculatediffrence(double n)
  {
	  double diff=0;
	  double sq=0,ss=0,n2=0;
	    for(double i=1;i<=n;i++)
	    {
	    	n2+=i;
	    	double n1=Math.pow(i,2);
	    	ss+=n1;
	    }
	    sq=Math.pow(n2,2);
	    
	    diff=sq-ss;
	    return diff;
  }
}
