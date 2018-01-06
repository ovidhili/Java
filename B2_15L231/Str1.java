public class Str1
{
	public static void main(String args[])
	{
      StringBuffer sb=new StringBuffer();
      String str="malayalam";
      sb.append(str);
      String rev;
      rev=sb.reverse().toString();
      if(str.equals(rev))
      {
    	  System.out.println("GIVEN STRING IS A PALINDROME");
      }
      else
      {
    	  System.out.println("GIVEN STRING IS NOT A PALINDROME");
      }
}
}
