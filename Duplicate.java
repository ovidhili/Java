class Duplicate
{
public static void main(String args[])
{
int temp;
int arr[]={4,78,12,5,0,66,9};
int len=arr.length;
int count=0;

for(int i=0;i<len;i++)
 {
   for(int j=i+1;j<len;j++)
    {
     if(arr[i]>arr[j])
       {
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
        }
     }
}



for(int p=0;p<len;p++)
 {
  for(int q=p+1;q<len;q++)
   { 
     if(arr[p]==arr[q])
       {
        count=1;
        break;
        
       }
     else
      {
        count=0;
      }
   }
 if(count==0)
  {
    System.out.print(+arr[p] +" ");
  }
 }
}
}

