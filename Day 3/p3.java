public class p3 {
    public static void main(String[] args) {
        // In this program i am gonna focus on.
        // stringbuffer and stringbuilder
        StringBuffer sbf = new StringBuffer(1);
        sbf.append("12");
        System.out.println(sbf);
        // Despite setting the capacity it won't give error as stringbuffer will
        // increase the capacity itself behind the scenes.
        StringBuffer s1 = new StringBuffer("Testing ");
        String s2 = "Testing";
        // I am gonna try the methods of Stringbuffer and string's too for reference.
        // System.out.println("Inserting Java in between "+s1.insert(10, "Java"));
        // Index out of bound error as i SB(stringbuffer) is less than 10
        // Okay so in sbf the size/capacity was given 1 by me but after appending it
        // increased to 3.
        System.out.println(" Inserting at 7 in SB " + s1.insert(8, "Java "));
        System.out.println(" Inserting at 7 in SB " + s1.insert(9, "Java "));
        System.out.println(" No way to insert in string as it is immutable while SB is not ");
        System.out.println("Capacity of SB " + s1.capacity());
        // How many space or capacity it has. It increases automatically. Until 2^32-1.
        System.out.println(" ");
        System.out.println(" Reverse " + s1.reverse());

        // There is not much practical difference between StringBuffer and
        // StringBuilders methods and fucntions
        // The difference between them is that StringBuilder doesn't create an object
        // and is not thread friendly
    }
}
