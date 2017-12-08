import java.util.Scanner;
class Adder
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

char choice=' ';
do
{
System.out.println("ENTER 1 TO ADD 2 TO SUB");
int n=s.nextInt();
System.out.println("ENTER INTEGERS");
int a=s.nextInt();
int b=s.nextInt();

if(n==1)
{
System.out.println(a+b);
}
else if(n==2)
{
System.out.println(a-b);
} 
System.out.println("ENTER Y TO CONTINUE");
choice=s.next().charAt(0);
continue;
}while((choice=='y')||(choice=='Y'));

}
}
