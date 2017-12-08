class Arraymax
{
public static void main(String args[])
{
   int max=0;
   int k=0;
   int arr[][]=new int[3][3];
   int len=args.length;
	for(int i=0;i<len/3;i++)
	{
		for(int j=0;j<len/3;j++)
		{
			int n=Integer.parseInt(args[k]);
			k++;
			arr[i][j]=n;
		}
	}
	for(int i=0;i<len/3;i++)
	{
		for(int j=0;j<len/3;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<len/3;i++)
	{
		for(int j=0;j<len/3;j++)
		{
			if(arr[i][j]>max)
			{
				max=arr[i][j];
			}
		}
	}
	System.out.println("MAXIMUM ELEMENT IN THE ARRAY IS:"+max);
}
}