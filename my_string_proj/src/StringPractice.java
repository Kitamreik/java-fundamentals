public class StringPractice {
    public static void main(String s[]) {
        String s1 = "Maple Tree";
        String s2 = "Maple Tree";
        String s3 = new String("Maple Tree");

        //operator
        System.out.println("s1 and s2 comparison "+ (s1 == s2));
        System.out.println("s2 and s3 comparison "+ (s2 == s3));

        //method
        System.out.println("Equality check s1 and s2 - "+s1.equals(s2));
        System.out.println("Equality check s1 and s3 - "+s1.equals(s3));

        String s4 = s1.substring(0,5);
        String s5 = s1.substring(6);
        System.out.println("s1.substring(0,5) - s4 " + s4);
        System.out.println("s1.substring(6) - s5 " + s5);

        s1 = s4.concat(" ").concat(s5);

        System.out.println("s1 " + s1);
        
        System.out.println("s1.toLowerCase() " + s1.toLowerCase());
        System.out.println("s1.toUpperCase() " + s1.toUpperCase());
    }
}