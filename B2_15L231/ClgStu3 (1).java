class ClgStu3 extends Student
 {
  String year;
  String dpt;
  ClgStu(String year,String dpt)
   {
    super();
    this.year=year;
    this.dpt=dpt;
   }
  void disp()
   {
     System.out.println("STUDENT NAME:"+this.name+" "+"YEAR:"+this.year+" "+"DEPARTMENT:"+this.dpt);
   }
}
  