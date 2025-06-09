public class Reference {
    // Class code goes here
    public static void main(String[] args) {
        System.out.println("Hello, World!");
     
        int number = 10; // This variable stores the number 10 

        /* This is a multi-line comment It can be used to explain a block of code or provide detailed information
        int sum = 0; //This variable will hold the sum of numbers */

        //Use the byte data type when you need to save memory in large arrays where the memory savings are critical, and the values are between -128 and 127.
        byte age = 25; // Age of a person 

        //Use the int integer data type to store whole numbers larger than what byte and short can hold. This is the most commonly used integer type.
        int population = 1000000; // Population of a city 

        //Use the long data type when you need to store very large integer values that exceed the range of int.
        long distanceToMoon = 384400000L; // Distance in meters 

        //Use the float when you need to store decimal numbers but do not require high precision (for example, up to 7 decimal places).
        float price = 19.99f; // Price of a product 

        //Use the double data type when you need to store decimal numbers and require high precision (up to 15 decimal places).
        double pi = 3.141592653589793; // Value of Pi 

        //Use the char data type when you need to store a single character such as a single letter or an initial.
        char initial = 'A'; // Initial of a person's name 

        //Use boolean when you need to represent a true/false value. Boolean is often used for conditions and decisions.
        boolean isLoggedIn = true; // User login status 

        //-------------
        //A string data type is a sequence of characters. The string data type is very useful for handling text in your programs.
        String greeting = "Hello, World of Java!"; 

        //An array is a collection of multiple values stored under a single variable name. All the values in an array must be of the same type. Arrays are great for storing lists of items, like student scores or names. The following code defines an integer array type of scores that include 85, 90, 78, and 92.
        int[] scores = {85, 90, 78, 92};

        //An enum is a special data type that defines a list of named values. An enum is useful for representing fixed sets of options, such as days of the week or colors.
        enum DaysOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;}

    }
}

/* This method calculates the square of a number.   
@param number The number to be squared   
@return The square of the input number   */ 
//public int square(int number) {  return number * number; } 
