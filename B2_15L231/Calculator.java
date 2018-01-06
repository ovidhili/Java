
public class Calculator {
	
	static void powerInt(int num1,int num2)
	{
		int i=0;
		 int result=1;
		
		while(i<num2)
		{
			result=num1*result;
			i++;
		}
		System.out.println("Power of two integer:"+result);
		
	}
	static void powerDouble(double num3,int num4)
	{
		int i=0;
		 double result=1;
		while(i<num4)
		{
			result=num3*result;
			i++;
		}
		System.out.println("power of one integer and one double:"+result);
	}
}
