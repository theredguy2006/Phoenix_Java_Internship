public class p2 {
    public static void main(String[] args) {
        // Learning String and it's methods and all.
        String s = "Kaif";
        // Another way the define a string but the above one is faster as it doesn't
        // create a new string object
        String s1 = new String("Kaif");
        // s = s.concat(s1);

        // String is immutable i java. If we modify or change the original one still
        // stays intact but the
        // original stays in the memory
        System.out.println(s);
        System.out.println(s1);

        // Despite having the same content it will be false.
        // the reason being using ==. It compare the reference value instead of the
        // content.
        // so s1 is in the stack memory and s is in the heap memory
        String s2 = "Kaif";
        System.out.println(s1 == s);
        System.out.println(s == s2);
        // they both are in heap memory so equa too.

        // Below is just a recap or display of String methods
        System.out.println(" Length " + s.length());
        System.out.println(" UpperCase  " + s.toUpperCase());
        System.out.println(" UpperCase  " + s.toLowerCase());
        System.out.println(" Char At when char is present   " + s.charAt(3));
        // System.out.println(" Char At when char is not present "+s.charAt(5)); out of
        // bound error
        s = "       This is for the substring test s        ";
        System.out.println(" Substring method this will only print 'this' " + s.substring(0, 4));
        System.out.println(" Index of element " + s.indexOf('s', 5));
        String s4 = "test";
        String s5 = new String("test");
        System.out.println("Using another string to to find indexOf " + s.indexOf(s4));
        System.out.println("Last index of  " + s.lastIndexOf(""));
        // The index of value treats string as a space.
        System.out.println(
                "Equals to which compares the content of the string instead of reference like ==" + s4.equals(s5));
        System.out.println(" Meanwhile '==' " + (s4 == s5));
        System.out.println("Equal Ignore case " + s4.equalsIgnoreCase(s5.toUpperCase()));
        System.out.println("Compare  Ignore case " + s4.equalsIgnoreCase(s5.toUpperCase()));
        // Same logic as compare value in Array
        System.out.println(" Compare to for +ve answer  " + s4.compareTo(s5.toUpperCase()));
        // // It stops at the first alphabest. Since i did uppercase for s5 and s4 is
        // lower
        // what happens t is compared with T. their difference is 32. It notes down the
        // first difference and returns the difference.
        // also the differene in ascii for every lower and upper alphabet is 32.
        // ascii value of lower char from 97 and for uppercase it start from 65
        System.out.println(" Compare to for -ve answer  " + s4.toUpperCase().compareTo(s5.toLowerCase()));
        System.out.println(" Compare to ignore case " + s4.toUpperCase().compareToIgnoreCase(s5.toLowerCase()));
        System.out.println(
                " Trim method it removes the extra whitespace but it doesn't target space in between the words . \n "
                        + s.trim());
        // Also it does not modify the original string.
        System.out.println(" Replace All  method "+s.replaceAll("s", "t"));
        System.out.println(" Replace First   method "+s.replaceFirst("s", "t"));
        System.out.println(" Replace    method "+s.replace(s4, s5));
        // Usualy both replace and replaceall are similar but thier main difference is that 
        // replaceall uaccept a regex which replace doesn't so. for example.
        System.out.println("Replace with regex "+s4.replace("t$", "a"));
        System.out.println("Meanwhile Replaceall with regex "+s4.replaceAll("t$", "a"));
        System.out.println("Contains method "+s4.contains("test"));
        System.out.println("Starts with  method "+s4.startsWith("t"));
        System.out.println("Ends with  method "+s4.startsWith("t"));
        char[] a2=s4.toCharArray();
        System.out.println("After using to char array the string is converted into a list of char ");
        for (char c : a2) {
            System.out.println(c);
        }
    }

}
