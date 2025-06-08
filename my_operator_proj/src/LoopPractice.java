public class LoopPractice {
    public static void main(String s[]) {
        //Arr Initialization
        int numbers[] = {10,20,30,40,50,60,70,80,90,100};
        //Math Application
        // addition elements at index 0,1
        // subtraction elements at index 2,3
        // multiplication elements at index 4,5
        // division elements at index 6,7
        // modulus elements at index 8,9

        // Addition
        System.out.println("Addition: + operator " + (numbers[0] + numbers[1]) );

        // Subtraction
        System.out.println("Subtraction: - operator " + (numbers[2] - numbers[3]) );

        // Multiplication
        System.out.println("Multiplication: * operator " + (numbers[4] * numbers[5]) );

        // Division
        System.out.println("Division: / operator " + (numbers[6] / numbers[7]) );

        // Modulus (remainder)
        System.out.println("Modulus: % operator " + (numbers[8] % numbers[9]) );

        //Loop Logic
        for (int i=0; i< numbers.length - 1; i++) {
            //if
            //Store the output variable as a String
            String output = numbers[i] //based on the current index
            <= numbers[i + 1] //Less than or 
            ? (numbers[i] //equal to
            < numbers[i + 1] //greater than
            ? " less than " : " equal to ") 
            : " more than ";
            //res
            System.out.println(numbers[i]+output+numbers[i+1]);
        }
    }
}