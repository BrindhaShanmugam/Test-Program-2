import java.util.Scanner;
public class Even{
public static void main(String ag[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if((a%2)==0)
{
System.out.println("The given number is even number");
}
else
{
System.out.println("The given number is odd number");
}
}
}