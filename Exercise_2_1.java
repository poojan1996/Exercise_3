import java.util.Scanner;

public class Exercise_2_1{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.println("Input First Number");
float a= in.nextFloat();

System.out.println("Input Second Number");
float b= in.nextFloat();

System.out.println("Input Third Number");
float c= in.nextFloat();

if(a>b && a>c){
System.out.println("Biggest Number is A: " +a);
}else if(a<b && b>c){
System.out.println("Biggest Number is B: " +b);
}else {
System.out.println("Biggest Number is C: " +c);
}
}
}
