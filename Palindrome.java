import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
String str1=args[0];
StringBuffer sb=new StringBuffer(str1);
String str2=sb.reverse().toString();
if(str1.equals(str2))
{
System.out.println("PALINDROME");
}
else
{
System.out.println("NOT A PALINDROME");
}
}
}
