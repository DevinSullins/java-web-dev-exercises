package exercises;
import java.util.Scanner;

public class MpgCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        String milesStr = input.nextLine();
        int miles = Integer.parseInt(milesStr);
        System.out.println("Gallons consumed: ");
        int gallonsStr = Integer.parseInt(input.nextLine());
        System.out.println("MPG: " + miles/gallonsStr);

    }
}
