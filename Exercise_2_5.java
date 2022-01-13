import java.util.Scanner;

public class Exercise_2_5{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("Input Number");
float a = in.nextFloat();

if (a %2 == 0)
System.out.println("The number " +a+ " is Even");

else if (a %2 != 0)
System.out.println("The number " +a+ " is Odd");

else
System.out.println("The number is " +a);

}
}
