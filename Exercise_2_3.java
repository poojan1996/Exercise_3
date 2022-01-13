import java.util.Scanner;

	public class Exercise_2_3{

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	System.out.println("Input temprature in fahrenheit");
	double userInput1 = in.nextDouble();

	double celsius = (((userInput1-32)*5)/9);	
	System.out.println("Temprature in Fahrenheit : " + userInput1 +" " +"Temprature in 	celsius : " + celsius);

	System.out.println("Input temprature in Celsius");
	double userInput2 = in.nextDouble();

	double fahrenheit = (((userInput2 * 9 )/5)+32);
	System.out.println("Temprature in Celsius : " + userInput2 +" " +"Temprature in Fahrenheit : " + fahrenheit);
}
}

