public class BookAccess {
    public static void main(String s[]) throws CloneNotSupportedException { //add exception. Any method within which clone() method of an object is being invoked should handle CloneNotSupportedException - like adding a warning to anticipate the exception.
        
        Book book1 = new Book("Java and Java Chip", "Kit Amreik", 30.00f);

        Book book2 = new Book();
        book2.setTitle("Java Joy");
        book2.setAuthor("Kit Amreik");
        book2.setPrice(25.00f);

        System.out.println("The first book object is ");
        System.out.println(book1);
        System.out.println("The second book object is ");
        System.out.println(book2);

        Book book3 = (Book)(book1.clone());
        System.out.println("The third book cloned object is ");
        System.out.println(book3);
    }
}