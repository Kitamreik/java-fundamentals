public class ArrayPractice {
    public static void main (String s[]) {
        int usersId[] = new int[10];
        usersId[0] = 10;
        usersId[1] = 11;
        usersId[2] = 12;
        usersId[3] = 13;
        usersId[4] = 14;
        usersId[5] = 15;
        usersId[6] = 16;
        usersId[7] = 17;
        usersId[8] = 18;
        usersId[9] = 19;

        int count_ids = usersId.length;
        for (int i = 0; i < count_ids; i++) {
            System.out.println(usersId[i]);
        }

        //System.out.println(usersId[0]);

        String greeting = "Hello, World of Java!"; 

        char[] charArr = greeting.toCharArray(); //Convert the string to a char array using the toCharArray() method.

        for (int i=0;i<charArr.length; i++) {
            System.out.print(charArr[i]);
        }

    }
}