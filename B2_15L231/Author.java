class Author
 {
   String name;
   private String email;
   private char gender;
  Author(String name,String email,char gender)
     {
       this.name=name;
       this.email=email;
       this.gender=gender;
    }
  void disp()
    {
      System.out.println("NAME: "+name+" "+"EMAIL: "+email+" "+"GENDER: "+gender);
    }
}
       