import java.util.Scanner;
public class Vowels{
public static void main(String ag[]){
Scanner s=new Scanner(System.in);
String s1=s.next();
s1=s1.toLowerCase();
char c1[]=new char[]{'a','e','i','o','u'};
char c[]=s1.toCharArray();

for(int i=0;i<c1.length;i++)
{
if(c[0]==(c1[i]))
{
System.out.println("The given character is vowel");
System.exit(0);
}
}
System.out.println("The given character is consonant");
}
}
