class Position
{
public static void main(String args[])
{
int p1=0,p2=0;
int sum=0;
int arr[]={7,1,6,3,9};
int len=arr.length;

for(int i=0;i<len;i++)
 {
    if(arr[i]==6)
     { 
      p1=i;
     }
    else if(arr[i]==7)

     { 
      p2=i;
     }

}

for(int i=0;i<len;i++)
 {
  if(p1>p2)
    { 
      sum+=arr[i];
    }
  else if(p1<p2)
    {
      if((i>=0 && i<=p1-1) || (i>=p2+1 && i<=len-1))
        sum+=arr[i];
    }
 }
System.out.println(sum);
}
}
       