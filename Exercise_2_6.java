import java.util.Scanner;

public class Exercise_2_6{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.println("Input First letter");
char ch = in.next().charAt(0);


if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
System.out.println("Entered Character " +ch+ " is an alphabet.");
}

else {
System.out.println("Entered Character " +ch+ " is not an alphabet.");
}
}
}
