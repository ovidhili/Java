class Occur
{
public static void main(String args[])
{
int temp;
int dup=0;
int c_max=0;
int arr[]={4,9,12,56,9,9,1};
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
        count=count+1;
        
       }
     else
       break;

   }
 if(count>c_max)
  {
    c_max=count;
    dup=arr[p];
  }
 }
System.out.println(dup);
}
}

