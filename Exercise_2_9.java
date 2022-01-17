import java.util.Scanner;
class Exercise_2_9{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("Input Month Number");
int a = in.nextInt();

if (a==1||a==3||a==5||a==7||a==8||a==10||a==12)
{
System.out.print("Month no " +a+ " has 31 days.");
}
else if (a==4||a==6||a==9||a==11){
System.out.println("Month no " +a+ " has 30 days.");
} else{
System.out.println("Month no " +a+ " has 28 days.");
}
}
}
