import java.util.Scanner;
public class Alpha{
public static void main(String ag[]){
Scanner s=new Scanner(System.in);
String s1=s.next();
char c[]=s1.toCharArray();
if(c[0]>='a'&&c[0]<='z'||c[0]>='A'&&c[0]<='Z')
{
System.out.println("The given character is alphabet");
}
else
System.out.println("The given character is not an alphabet");
}
}