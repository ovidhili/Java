import java.util.Scanner;
class Avg
{
public static void main(String args[])
{

int sum=0;
int avg;
int x[]={1,2,3,4,5};
int len=x.length;
for(int i:x)
{
sum+=x[i];
}
avg=sum/len;
System.out.println("SUM IS:" +sum);
System.out.println("AVG IS:" +avg);
}
}

