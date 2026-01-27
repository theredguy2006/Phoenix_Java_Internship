
public class p2 {
    public static void main(String[] args) {
        // grandFather g=new grandFather();
        // father f=new father();
        // While running this program i came across a intersting thing and phenomenon
        // that when i directly use or run the program by the f10 or just the play
        // button from vs code. it doesn't work properly and doesn't print the values
        // from constructor.
        // but when i run it manually from the cmd. using java p2.java. it works
        // perfectly. so what is this why is this happening i am gonna look into that.

        // Okay another weird phenomenon i faced is that when these three
        // classes(grandfather and all) are above and then i run the program it gives me
        // this error.
        // PS D:\Internship\Phoenix_Java_Internship\Day 5> java p2.java
        // error: can't find main(String[]) method in class: grandFather

        // Howeve if the main is above the 3 classes it works perfectly.

        // PS D:\Internship\Phoenix_Java_Internship\Day 5> java p2.java
        // This is the grandfather's constructor
        // This is the father's constructor
        // This is the son's constructor

        // Still didn't find the find answer yet but if i have to predict what's going
        // on.
        // java usually goes top to bottom and left to right.
        // so while running the program it sees that grandfather doesn't have a psvm it
        // stops there and doesn't go any further
        // while the other phenomenon that when i press f5 why it's not working
        // properly. i think it's to do something with this method or way not compiling
        // every class and directly going for the main class idk.

        // I still don't understand it fully but what i understand partially is
        // that the f5 thing is ide problem it doesn't know the intended entry point of
        // the class so as a result it behaves weirdly and doesn't give the intended
        // output

        // now the thing with java p2.java giving error when running with grandfather on
        // top.
        // the way it works. the jvm compiler assumes that the first class is the entry
        // point of the class so it searches for the main in there and if it's not there
        // then hence error.

        // what i should i do in future to avoid this weird thing. 
        // 1.) Give proper strcuture to code and follow proper file naming conventions such as. 
        // the first class will be the name of the class and which contains the main inside.

        son s = new son();

    }

}

class grandFather {

    public grandFather() {
        System.out.println(" This is the grandfather's constructor ");
    }

}

class father extends grandFather {

    public father() {
        // super(); // this is not required but i am still writing it just to show how
        // that process
        // works.
        System.out.println(" This is the father's constructor ");
    }

}

class son extends father {
    public son() {
        // super(); // this will be explicitly writing or something .
        System.out.println(" This is the son's constructor ");
    }

}
