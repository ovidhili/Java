class Sorting
{
public static void main(String args[])
{
int temp;
int arr[]={4,78,12,5,0.66,9};
int len=arr.length;
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
for(int i=0;i<len;i++)
 {
 System.out.print(+arr[i] +"  , ");
 }
}
}

