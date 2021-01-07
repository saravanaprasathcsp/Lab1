/*Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
    *@arthur 
    *Saravana prasath
    *
    *  */
package lab1exercises;

public class Exercise2 {

	public static void main(String[] args) {
	//	String str1=red;
		//String str2=yellow;
		//String str3=green;
		System.out.println(trafficlight("red"));

	}
	public static String trafficlight(String str)
	{
		String str1=null;
		if(str.equals("red"))
		{
			 str1="Stop";
		}
		else if(str.equals("yellow"))
		{
			str1="Wait";
		}else if(str.equals("green"))
		{
			str1="Go";
		}
		return str1;
	}

}
