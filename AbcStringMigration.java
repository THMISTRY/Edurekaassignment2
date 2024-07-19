package edureka_project2;

public class AbcStringMigration {

    public static void main(String[] args) {
        String a = "abcdef";
        String b = "xyz1234";
        String c = "abcxy";

//        verify length of a
        boolean lengthcheck = a.length() > c.length() && a.length() < b.length();
        System.out.println("Length check : " +lengthcheck);

//        a should not be equal to b & c
        boolean equalitycheck = !a.equals(b) && !a.equals(c);
        System.out.println("Equality check : " +equalitycheck);

//        c should be same as a variable irrespective case
        boolean caseInsensitivecheck = a.equalsIgnoreCase(c);
        System.out.println("Case-insensitive check :" + caseInsensitivecheck);

//        a variable should contain cd and should not contain xy
        boolean containsCD = a.contains("cd");
        boolean containsXY = a.contains("xy");
        System.out.println("Contains CD :" +containsCD);
        System.out.println("Does not contains XY : " +!containsXY);

//        convert b in uppercase Z
        String buppercase = b.toUpperCase();
        boolean containsuppercaseZ = buppercase.contains("Z");
        boolean containsLowercasez = b.contains("z");
        System.out.println("Uppesrcase 'b' : " +buppercase);
        System.out.println("Contains 'Z': " +containsuppercaseZ);
        System.out.println("Does not contains 'z': " +!containsLowercasez);

//        validate length of a
        boolean lengthCheck = a.length() > c.length() && a.length() < b.length();
        System.out.println("Length check: " + lengthCheck);

//        Perform concatenate on ‘a’ and ‘b’ variables
        String concatenated = a + b;
        boolean lengthComparison = concatenated.length() < c.length() || concatenated.length() > 5;
        System.out.println("Concatenated length check: " + lengthComparison);

//        Validate if the ‘a’ variable start with “ab”
        boolean startsWithAb = a.startsWith("ab");
        System.out.println("Starts with 'ab': " + startsWithAb);

//        Check if 'b' does not end with "yz"
        boolean endsWithYz = !b.endsWith("yz");
        System.out.println("Does not end with 'yz': " + endsWithYz);

//        Validate if 'c' contains a space and does not contain 9
        boolean containsSpace = c.contains(" ");
        boolean containsDigit9 = c.contains("9");
        System.out.println("Contains space: " + containsSpace);
        System.out.println("Does not contain digit 9: " + !containsDigit9);

    }




}
