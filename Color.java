import java.util.Scanner;
class Color
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String c=s.next();
switch(c)
{
case "R":System.out.println("RED");
         break;
case "O":System.out.println("ORANGE"); 

        break;
case "Y":System.out.println("YELLOW"); 

        break;
case "B":System.out.println("BLUE"); 

        break;
case "G":System.out.println("GREEN"); 

        break;
case "W":System.out.println("WHITE"); 

        break;
default:System.out.println("INVALID CODE");
        break;
}
}
}
