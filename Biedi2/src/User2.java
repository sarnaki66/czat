import java.io.File;
import java.util.Scanner;

public class User2 {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Adrian\\Desktop\\plik.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("Plik został utworzony.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


            try {
                Scanner sf = new Scanner(f);
                System.out.println("\nCZAT: ");
                while (sf.hasNextLine()) {
                    System.out.println(sf.nextLine());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}

