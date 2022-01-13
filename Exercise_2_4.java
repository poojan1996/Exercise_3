import java.util.Scanner;

public class Exercise_2_4{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("Input Number");
float a = in.nextFloat();

if (a > 0)
System.out.println("The number is " +a+ " Positive");

else if (a < 0)
System.out.println("The number is " +a+ " Negative");

else
System.out.println("The number is " +a);

}
}
