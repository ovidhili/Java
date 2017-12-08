class Test
{
public static void main(String args[])
{
char c1='#';
if(Character.isDigit(c1))
{
System.out.println("DIGIT");
}
else if(Character.isLetter(c1))
{
System.out.println("ALPHABET");
}
else
{
System.out.println("SPECUAL CHARACTERS");
}
}
}

