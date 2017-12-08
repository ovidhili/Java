import java.util.Scanner;
class Divide
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
  if(i%2==0)
    {
    System.out.println("NUMBER IS DIVISIBLE BY 2:" +i);
    }


  else if(i%5==0)
    {
    System.out.println("NUMBER IS DIVISIBLE BY 5:" +i);
    }

  else if(i%3==0)
    {
    System.out.println("NUMBER IS DIVISIBLE BY 3:" +i);
    }
  else
    System.out.println("INVALID NUMBER" +i);
}
}
}
   
