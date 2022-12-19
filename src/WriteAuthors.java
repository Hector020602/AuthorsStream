import java.io.*;
import java.util.Scanner;

public class WriteAuthors {
    public static void main(String[] args) throws IOException {
        DataOutputStream output = null;
        Scanner input = new Scanner(System.in);
        try {
            output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("authors.dat")));

            String answer = "Y";

            while (!answer.equals("n")) {
                System.out.println("Enter Author");
                Scanner scanner = null;
                Author a = Author.readFromKeyboard(scanner);
                output.writeUTF(a.getName());
                output.writeUTF(a.getEmail());
                output.writeChar(a.getGender());
                output.writeInt(a.getYear());
                System.out.println("Another author? (Y/N): ");
                answer = input.next().toLowerCase();
            }
        }finally {
            if (output != null) {
                output.close();
            }
        }
    }
}






