class Number
{
public static void main(String args[])
{
int i,a;
int flag=0;
int a1=Integer.parseInt(args[0]);
a=a1/2;
if(a1==0 || a1==1)
 {
   System.out.println("NEITHER PRIME NOR COMPOSITE");
 }

else 
{
for(i=2;i<=a;i++)
 {
  if(a1%i==0)
   {
     
     flag=1;
     break;
   }
 
 }
if(flag==0)
{
System.out.println("A PRIME NUMBER");
}
else
{
System.out.println("NOT A PRIME NUMBER");
}
}
}
}
