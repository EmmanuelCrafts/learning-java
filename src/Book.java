public class Book {
   String title;
   String author;
   public Book(String title, String author){
       this.title = title;
       this.author = author;
   }
   public void display(){
       System.out.println("Book title: "+ title + " ," + " Author: "+author);
   }
  public static void main(String[] args){
      Book[] arr = new Book[5];
      arr[0] = new Book("Captured my Heart","GUC");
      arr[1] = new Book("Ommema","Maverick city");
      arr[2] = new Book("Trust you","7 hills worship");
      arr[3] = new Book("Jerusalem","Theophillus Sunday");
      arr[4] = new Book("Fellowship","Ebuka Songs");

      for ( Book book : arr){
          book.display();
      }
  }
}
//. Create a Book class with title and author. Store 5 books in an array and use a for-each loop to print details of all books.