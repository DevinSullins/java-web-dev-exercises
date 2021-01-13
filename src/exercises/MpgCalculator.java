package exercises;
import java.util.Scanner;

public class MpgCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        int miles = Integer.parseInt(input.nextLine());
        System.out.println("Gallons consumed: ");
        int gallons = Integer.parseInt(input.nextLine());
        System.out.println("MPG: " + miles/gallons);

    }
}
