import java.io.*;
public class WriteObjectBook {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("booksobject.dat")));
            Author author = new Author("Patrick Rothfuss","p@gmail.com",'m',1967);

            Book b1 = new Book("The name of the wind",author,57);
        } finally {

        }
    }

}
