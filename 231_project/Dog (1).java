
class Dog
 {
  int drinkTime;
   boolean b;
   public void setDrinkTime(int drinkTime)
     {
       this.drinkTime=drinkTime;
     }
     
   public int getDrinkTime()
     {
      return drinkTime;
     }
    
   public void needsToGo()
     {
      
      if(drinkTime>=4)
       {
        b=true;
        System.out.println("testdogwalk1"+" "+b);
       }
      else
        {
         System.out.println("THERE IS MORE TIME FOR WALK");
        }
     }
  
}