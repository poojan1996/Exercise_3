import java.util.Scanner;

class Exercise_2_7{
public static void main(String[] args){

int  count = 0;
boolean flag = false;

Scanner in = new Scanner(System.in);

System.out.println("Enter Number");
int num = in.nextInt();

for(int i = 2; i < num; i++){

if(num % i ==0){
	flag = true;
	break;
}

}

if (!flag){
	System.out.println(num + " Is a prime number");
}
else{
	System.out.println(num + " Is not a prime number");
}
}
}
