
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        try {
            File f = new File("1.txt");
            if (f.createNewFile()) {
                System.out.println("New File Created ");
            } else {
                System.out.println("File already Created ");
            }
        } catch (IOException ie) {
            System.out.println("An error has occured ");
            ie.printStackTrace();
        }
        // Writing Text File
        try {

            FileWriter Writer = new FileWriter("myfile.txt");

            // Writing File
            Writer.write("Writing a file in java \n");
            // Writer.close(); also if try to write after the file has been closed we can
            // get IOException cause stream is closed
            // Unless we don't write this the file will be empty and nothing will be written
            // in it.

            // System.out.println("Successfully written.");
            Writer.write("Just Trying to Check if we can really write in the file unless we close it ");
            // The File will be created but it will be empty since we have not closed it yet

            // After we close it.
            Writer.close();
            System.out.println();

            // Trying to read a file from
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);

            // Traversing File Data
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);

            }
            // Earlier the file wasn't deleted. cause depsite closing it via the writer
            // portion it was still option in the reader portion so to delete it we need to
            // close it there to too.
            Reader.close();

            // Trying to Delete it.
            if (Obj.delete()) {
                System.out.println("The file has been deleted " + Obj.getName());
            } else {
                System.out.println("The file wasn't deleted. ");

            }
        } catch (FileNotFoundException fe) {
            System.out.println("An error has occurred.");
            fe.printStackTrace();

        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }

}

// /Learning about fild Handling in this file

// FileInputStream: reads raw bytes from a file. (Usefull for images and other
// media files )
// FileOutputStream: writes raw bytes to a file. (Same as above)
// BufferedInputStream / BufferedOutputStream: use buffering for faster (Usefull
// for images and other media files )
// performance.

// The below are mainly for text files.
// FileReader: reads characters from a file.
// FileWriter: writes characters to a file.
// BufferedReader: reads text efficiently using buffering; also provides
// readLine() for reading lines.
// BufferedWriter: writes text efficiently using buffering.
