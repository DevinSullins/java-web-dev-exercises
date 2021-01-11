package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length: ");
        String lengthStr = input.nextLine();
        int length = Integer.parseInt(lengthStr);
        System.out.println("Width: ");
        String widthStr = input.nextLine();
        int width = Integer.parseInt(widthStr);
        System.out.println("Area: " + length * width);
    }
}
