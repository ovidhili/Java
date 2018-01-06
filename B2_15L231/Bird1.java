class Bird1 extends Animal1
 {
  void fly()
   {
     System.out.println("FLY: "+" "+"1.5KM PER HR");

   }
  public static void main(String args[])
   {
    Bird b=new Bird();
    b.eat();
    b.sleep();
    b.fly();
  }
}