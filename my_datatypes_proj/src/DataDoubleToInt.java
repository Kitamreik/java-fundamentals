public class DataDoubleToInt {
    public static void main(String s[]) {
        double area_circle = 78.53981634d; //double  is used for numbers with decimal,  with precision up to 15 decimal digits
        System.out.println("Area of circle of 5cm radius is  " + area_circle);
        System.out.println("Area of circle of 5cm radius is  " + (int)area_circle); //convert to integer
    }
}