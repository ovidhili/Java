class Book
 {
  private String name;
  private String author; 
  private double price;
  private int qtyInStock;
  Book(String name,String author,double price,int qtyInStock)
   { 
     this.name=name;
     this.author=author;
     this.price=price;
     this.qtyInStock=qtyInStock;
   }
 public void getName()
   {
     System.out.println("BOOK NAME: "+name);
   }

 public void getauthor()
   {
     System.out.println("AUTHOR: "+author);
   }

 public void getprice()
   {
     System.out.println("PRICE: "+price);
   }
 public void getqtyInStock()
   {
     System.out.println("QUANTITY "+qtyInStock);
   }
 
  public static void main(String args[])
   {
    Author ar=new Author("J.K ROWLING ","jk97@gmail.com",'F');
    Book bk=new Book("HARRY POTTER",ar.name,8000,5000);
    ar.disp();
    bk.getName();
    bk.getauthor();
    bk.getprice();
    bk.getqtyInStock();
  }
}