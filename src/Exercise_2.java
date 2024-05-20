import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci prima stringa: ");
        String firstString =sc.nextLine();
        System.out.println("Inserisci seconda stringa: ");
        String secondString =sc.nextLine();
        System.out.println("Inserisci terza stringa: ");
        String thirdString = sc.nextLine();

        System.out.println(firstString + " " + secondString + " " + thirdString);
        System.out.println(thirdString + " " + secondString + " " + firstString);

    }


}
