import java.util.*;
public class Reverse{
public static void main(String ag[]){
Scanner s=new Scanner(System.in);
String s1=s.next();
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
String s2=sb.toString();
System.out.println(s2);
}
}
