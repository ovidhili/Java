import java.util.Scanner;
class Max
{
public static void main(String args[])
{
int x[]={1,2,3,4,5,6};
int len=x.length;
int max=-999;
int min=999;
for(int i=0;i<len;i++)
{
if(x[i]>max)
{
max=x[i];
}
if(x[i]<min)
{
min=x[i];
}
}
System.out.println("MAX ELEMENT IS:" +max);
System.out.println("MIN ELEMENT IS:" +min);

}
}

