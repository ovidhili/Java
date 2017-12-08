class Testing
{
public static void main(String args[])
{
int age=Integer.parseInt(args[1]);

if(args[0].equals("female"))
{
if(age>=1 && age<=58)
{
System.out.println("8.2%");
}
if(age>=59 && age<=120)
{
System.out.println("7.6%");
}
}


if(args[0].equals("male"))
{
if(age>=1 && age<=60)
{
System.out.println("9.2%");
}
if(age>=61 && age<=120)
{
System.out.println("8.3%");
}
}

}
}

