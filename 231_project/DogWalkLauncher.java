class DogOwner extends Dog
 {
  public void takeForWalk()
   {
     if(b)
       {
         System.out.println("testdogwalk2"+" "+"true");
       }
     else
       {
         System.out.println("false");
       }
   }
 
}

class DogWalkLauncher
 {
   public static void main(String args[])
     {
       DogOwner dr=new DogOwner();
       dr.setDrinkTime(5);
       dr.getDrinkTime();
       dr.needsToGo();
       dr.takeForWalk();
     }
}