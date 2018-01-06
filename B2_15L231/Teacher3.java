

class Teacher3 extends Person
  {
    double sal;
    String sub;
    Teacher(double sal,String sub)
     {
      super("chals");
      this.sal=sal;
      this.sub=sub;
     }
     void disp()
      {
       System.out.println("TEACHER NAME:"+this.name+" "+"SALARY:"+this.sal+" "+"SUBJECT:"+this.sub);
      }
   public static void main(String args[])
    {
     Teacher3 t=new Teacher3(21220.25,"VI");
     t.disp();
     ClgStu3 c=new ClgStu3("III YR","ECE");
     c.disp();
    }
 }