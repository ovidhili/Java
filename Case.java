class Case
{
public static void main(String args[])
{
char c1='Z';

int a1=(int)c1;
if(a1>=65 && a1<=90)
{
char u=Character.toLowerCase(c1);
System.out.println(c1+ "->" +u);
}
else if(a1>=97 && a1<=122)
{
char l=Character.toUpperCase(c1);
System.out.println(c1+ "-> " +l);
}
else
System.out.println("SPECIAL CHARACTERS");
}
}

OUTPUT:







