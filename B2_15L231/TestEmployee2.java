class Employee2 extends Person2
 {
  double aSal;
  int year;
  String insMem;

  Employee2(double aSal,int year,String insMem)
  { 
   super("Oviya");
   this.aSal= aSal;
   this.year=year;
   this.insMem=insMem;
  }
  void disp()
   {
    System.out.println("NAME:"+" "+name);
    System.out.println("ANNUAL SALARY:"+" "+aSal);
    System.out.println("YEAR OF STARTING:"+" "+year);
    System.out.println("INSURANCE MEMBER:"+" "+insMem);
  }
}
class TestEmployee2
 {
   public static void main(String args[])
    {
     Employee2 t=new Employee2(25000,1997,"YES");
     t.disp();
    }
}