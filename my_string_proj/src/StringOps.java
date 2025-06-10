public class StringOps {
    public static void main(String s[]) {
        //String s1 = "Hello World"; //String literal: Java creates a String literal in the String constant pool. This pool is a memory area where Java stores String literals. If the same string literal is used again in the code, Java reuses the existing instance from the pool, instead of allocating memory for another one.
        //System.out.println(s1);

        //String s2 = new String("Hello World"); //String Object: Java creates a new String object on the heap memory. This object is not stored in the String constant pool - a new object is created in the memory, though the content are the same.
        //System.out.println(s2);

        //String s3 = "Hello World";

        //operator returns true only if both operands point to the same object in the memory heap.
        // System.out.println("s1 and s2 comparison "+ (s1 == s2));
        // System.out.println("s2 and s3 comparison "+ (s2 == s3));
        // System.out.println("s1 and s3 comparison "+ (s1 == s3));

        //--STRING METHODS--
        // String s4 = "The quick brown fox jumped over the lazy dog";
        // System.out.println(s4.length());

        // char[] strAsArr = s4.toCharArray();
        // System.out.println(strAsArr.length);
        // System.out.println(strAsArr);
        //----
        // System.out.println("The first char of the string is " + strAsArr[0]);
        // System.out.println("The last char of the string is " + strAsArr[strAsArr.length-1]);
        // System.out.println("The index of T is " + s1.indexOf('T'));
        // System.out.println("The index of g is " + s1.indexOf('g'));

        //--STRING COMPARISON---
        // String s1 = "Washington";
        // String s2 = new String("Washington");
        // String s3 = "WASHINGTON";

        //.equals - Returns true if the content of two Strings are exactly the same including the leading and trailing space.
        // System.out.println("Equality check s1 and s2 - "+s1.equals(s2));
        // System.out.println("Equality check s1 and s3 - "+s1.equals(s3));
        // System.out.println("Equality check s1 and s3 ignoring case - "+s1.equalsIgnoreCase(s3)); 
        //.equalsIgnoreCase - Returns true ignoring the case of the two Strings. But the characters have to be in the same positions in both Strings and should not have any leading and trailing spaces.

        // .toLowerCase() - Returns a new String object with all the characters in the String object on which it is invoked, as lowercase. If there are any non-alphabetic characters, those are kept as is.
        // System.out.println("s1 in lowercase - "+s1.toLowerCase());
        // System.out.println("s3 in lowercase - "+s3.toLowerCase());
        // System.out.println("s1 and s3 lowercase equality check - " + s1.toLowerCase().equals((s3.toLowerCase())));

        // .toUpperCase() - Returns a new String object with all the characters in the String object on which it is invoked, as uppercase. If there are any non-alphabetic characters, those are kept as is.
        // System.out.println("s1 in uppercase - "+s1.toUpperCase());
        // System.out.println("s3 in uppercase - "+s3.toUpperCase());

        // String s4 = "50F1A";
        // System.out.println("s4 in lowercase - "+s4.toLowerCase());

        // String regexStr = "^W.*"; //^W.* - matches all Strings that start with uppercase W followed by any characeters or any length.
        // System.out.println("s1 matches regex ^W.* - "+s1.matches(regexStr));
        // System.out.println("s3 matches regex ^W.* - "+s3.matches(regexStr));

        // String s5 = "     WASHINGTON          ";
        // System.out.println("Equality check s3 and s5 - "+s3.equals(s5));
        // s5 = s5.strip(); //.strip() - Removes the leading and trailing white spaces. This is extremely useful when dealing with data.
        // System.out.println("Equality check after stripping s3 and s5 - "+s3.equals(s5));

        //---CONCATENATION AND SUBSTRING-ING ----
        String s1 = "Washington";
        String s2 = " DC";
        s1 = s1.concat(s2); //.concat - Java creates a new String object and copies the characters from the original Strings to the new object.
        System.out.println("s1 " + s1);

        s1 = s1.substring(0,10); //.substring - Java creates a new String object and copies the characters from the index position passed as first parameter to the index position passed as second parameter from the original Strings to the new object.
        System.out.println("s1 " + s1);
        System.out.println("s1.substring(7,10) " + s1.substring(7,10));
        System.out.println("s1.substring(7) " + s1.substring(7));

    }
}