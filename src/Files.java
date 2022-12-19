import java.io.File;

public class Files {
    public static void main(String[] args) {
        File f = new File("booksobject.dat");
        System.out.println(f.canRead());
    }
}
