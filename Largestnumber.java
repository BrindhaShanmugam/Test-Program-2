import java.util.Scanner;
public class Largestnumber{
public static void main(String ag[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();

if((a>b)&&(a>c))
{
System.out.println("Largest number is "+a);
}
else if(b>c)
{
System.out.println("Largest number is "+b);
}
else
System.out.println("Largest number is "+c);
}
}

