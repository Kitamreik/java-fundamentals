public class ArrayAccess {
    public static void main(String s[]) {
        //how the method considers the main method's input parameters
        int num_args = s.length;
        System.out.println("the length of the array is " + num_args);
        for (int i=0; i<num_args; i++) {
            System.out.println(s[i]);
        }

        /*
        int years[] = {2020,2021,2022,2023,2024,2025}; - An array named years of type int is declared and it is initialized and assigned with some numbers.
        System.out.println(years[n]); - Prints the element in nth position, where n starts from 0. The first element of the array is accessed with index 0. If the length of the array is m, the index position last element of the array is m-1. In the case of the example used here, the length of the array is 6 and the index of the last element is 5.
        */
        // int years[] = {2020,2021,2022,2023,2024,2025};
         //---------
        int years[] = new int[6];
        years[0] = 2020;
        years[1] = 2021;
        years[2] = 2022;
        years[3] = 2023;
        years[4] = 2024;
        years[5] = 2025;

        int count_years = years.length;
        System.out.println("the length of the array is " + count_years);
        for (int i=0; i<count_years; i++) {
            System.out.println(years[i]);
        }
        /*
        int years[] = new int[6]; - An array named years of type int is declared The array is initialized to hold six (6) elements. When an array initializes, depending on the type of array, the array has default values. An int array by default, has value the value of zero (0).

        years[n] - Allocates an element at the specified index n. In this example at 1 and 3.

        System.out.println(years[n]); - Prints the element in nth position, where n starts from 0. In this example, as you are only assigning values to index, you will see what values are allocated to the rest of the elements when you compile and run the code.
        */
        //-------
        // System.out.println(years[0]);
        // System.out.println(years[1]);
        // System.out.println(years[2]);
        // System.out.println(years[3]);
        // System.out.println(years[4]);
        // System.out.println(years[5]);
    }
}

