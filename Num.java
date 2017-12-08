class Num
{
public static void main(String args[])
{
int i;
int flag=0,j;
for(i=10;i<=99;i++)
 {
  for(j=2;j<=i/2;j++)
  {
   
   if(i%j==0)
    {
     flag=1;
    }
}

     if(flag==0)
       {
         System.out.println(i); 
        }
flag=0;
 }
}
}
