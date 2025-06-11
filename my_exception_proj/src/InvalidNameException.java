class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message); /// Pass the message to the parent Exception
    }
}
//Refactor:
public class CustomExceptionExample {  
   public static void main(String[] args) {  
 try {  
   throw new MyCustomException("This is a custom exception message.");  
 } catch (MyCustomException e) {  
   System.out.println(e.getMessage());  
   } 
  } 
} 