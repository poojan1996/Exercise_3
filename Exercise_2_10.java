import java.util.Scanner;

public class Exercise_2_10{
    public static void main(String args[]){
   
int marks[] = new int[3];
int i;
float total=0, avg;
Scanner in = new Scanner(System.in);
		
        
for(i=0; i<3; i++) { 
System.out.print("Enter Marks of Subject"+(i+1)+":");
marks[i] = in.nextInt();
total = total + marks[i];}
avg = total/3;
System.out.print("The student Grade is: ");
if(avg>=80){
System.out.print("A");
}else if(avg>=60 && avg<80)
{
 System.out.print("B");
} 
else if(avg>=50 && avg<60)
{
System.out.print("C");
}
else if(avg>=40 && avg<50)
{
System.out.print("D");
}
else if(avg>=25 && avg<45)
{
System.out.print("E");
}
else
{
System.out.print("F");
}
}
}
