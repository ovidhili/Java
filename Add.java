class Add
{
public static void main(String args[])
{
int i;
int sum=0;
int a=1234;
for(i=0;i<=4;i++)
{
int n=a%10;
sum+=n;
a=a/10;
}
System.out.println(sum);
}
}
