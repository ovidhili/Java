class Array2d
{
public static void main(String args[])
{
 int k=0;
 int arr[][]=new int[2][2]; 
 int len=args.length;
 if(len<4)
   { 
     System.out.println("NUMBER IS LESS THAN 4");
   }
 else
  {
   for(int i=0;i<len/2;i++)
    {
     for(int j=0;j<len/2;j++)
      {
       int n=Integer.parseInt(args[k]);
       k++;
       arr[i][j]=n;
      }
      
     }
  }
System.out.println("2D ARRAY IS: :"); 
for(int i=0;i<len/2;i++)
    {
     for(int j=0;j<len/2;j++)
      {  
        System.out.print(arr[i][j]+" ");
      }
       System.out.println();
    }
   System.out.println("The  REVERSED ARRAY IS:");
for(int i=(len/2)-1;i>=0;i--)
    {
     for(int j=(len/2)-1;j>=0;j--)
      {  
        System.out.print(arr[i][j]+" ");
      }
       System.out.println();
    }
}
}



  
       
 

