import java.util.Scanner;
public class helloWorld {
    public static void main(String[]args){

        String line;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        line = in.nextLine();
        System.out.println(line);
    }
}
