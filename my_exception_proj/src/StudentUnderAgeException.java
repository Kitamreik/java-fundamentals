// Custom exception class for underage students
class StudentUnderAgeException extends Exception {
    public StudentUnderAgeException(String message) {
        super(message);
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