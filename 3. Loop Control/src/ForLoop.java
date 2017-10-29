import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter starting number:");
        int startingNo= input.nextByte();
        System.out.print("Enter ending number:");
        int endingNo= input.nextByte();

        for (;startingNo<=endingNo;startingNo++){

            System.out.println(startingNo);
        }
    }
}

