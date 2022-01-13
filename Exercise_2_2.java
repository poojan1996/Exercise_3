import java.util.Scanner;

public class Exercise_2_2{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.println("Input First Number");
int a= in.nextInt();
if(a % 4 == 0 )
System.out.println(a +" Year is a leap year : ");

else
System.out.println(a +" Year is not a leap year : ");
}
}
