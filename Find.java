import java.util.Scanner;
class Find
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE ELEMENT TO SEARCH");
int a=s.nextInt();
int flag=0;
int x[]={1,2,3,4,5,6};
int len=x.length;
for(int i=0;i<len;i++)
{
  if(a==x[i])
   {
   
  System.out.println("INDEX OF THE ELEMENT IS:" +i);
  flag=1;
   break;
   }
}
  if(flag==0)
{
System.out.println("-1");
 }
   
}
}
