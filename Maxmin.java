class Maxmin
{
public static void main(String args[])
{
int temp;
int arr[]={65,66,67,68,69,70};
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

 System.out.println("FIRST MAX IS:" +arr[len-1] +"     " +"SECOND MAX IS:" +arr[len-2]);
 System.out.println("FIRST MIN IS:" +arr[0]  +"    "+"SECOND MIN IS:" +arr[1]);
 

}
}

