/**
 * @author fazliberkordek
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //todo: Take users birth day as a year in INT
        int date,sign;
        //Users date of birth;
        System.out.print("Type the date of birth year:");
        date=input.nextInt();
        sign = date%12;
        switch (sign){
            case 0:
                System.out.println("Monkeeey!");
                break;
            case 1:
                System.out.println("Cock");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("Bull");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon!!");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Invalid date !!");
        }

    }
}