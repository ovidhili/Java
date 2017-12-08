class Print
{
public static void main(String args[])
{
System.out.println("ENTER THE ELEMENT TO SEARCH");
int arr[]={65,66,67,68,69,70};
char x[]=new char[10];
int len=arr.length;
char c;
for(int i=0;i<len;i++)
 {
  c=(char)arr[i];
  x[i]=c;
 }
for(int i=0;i<len;i++)
 {
  System.out.print(x[i]+" ");
 }
}
}
