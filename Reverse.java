import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
int z;
int arr[]=new int[5];
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
for(int i=0;i<5;i++)
{
z=n%10;
arr[i]=z;
n=n/10;

}
}
for(int i=0;i<5;i++)
{
System.out.print(arr[i]);
}
}
}
