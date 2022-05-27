package chapter4;
import java.util.Scanner;

public class NokiaPhone {
    private static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        openMainMenu();
        openPhoneBookMainMenu();
        openMessageSettings();
        openCallRegister();
        showCallDuration();
    }

    public static void openMainMenu() {
        System.out.println("Enter 1 to oen main menu: ");
        int digit = input.nextInt();
        if(digit == 1) System.out.println("""
                List of menu functions:
                  1.Phone book
                  2.Messages
                  3.Call register
                \s""");

        }



    public static void openPhoneBookMainMenu(){
        System.out.println("Enter a number to view particular menu functions: ");
        int digit = input.nextInt();
        if(digit == 1) System.out.println("""
                1.Phone Book >\s
                1.Search
                2.Service Nos.
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send b'card
                8.Options
                9.Speed dials
                10.Voice tags""".indent(1));
        else System.out.println();

        System.out.println("%5s, Enter a number to access phone book options: ");
        int number1 = input.nextInt();
        if(number1 == 1) System.out.println("""
                     > Search options:
                1.Search for contact
                2.Search for phone number""");
    }

    public static void openMessageSettings(){
        System.out.println("Enter a number to view particular menu functions: ");
        int digit = input.nextInt();
        if(digit == 2) System.out.println("""
                2.Messages >
                  1.Write Messages
                  2.Inbox
                  3.Outbox
                  4.Picture Messages
                  5.Templates
                  6.Smileys
                  7.Message Settings
                  8.Info service
                  9.Voice mailbox number
                  10.Service Command Editor
                """);
        else System.out.println();
    }

    public static void openCallRegister(){
        System.out.println("Enter a number to view particular menu functions: ");
        int digit = input.nextInt();
        if(digit == 3) System.out.println("""
                  1.Missed Calls
                  2.Received calls
                  3.Dialled Numbers
                  4.Erase recent call list
                  5.Show call duration
                  6.Show call costs
                  7.Call cost settings
                  8.Prepaid credits
                """);

    }

    public static void showCallDuration(){
        System.out.println("Enter a number to view particular menu functions: ");
        int digit = input.nextInt();
        if(digit == 5) System.out.println("""
                  1.Last call duration
                  2.All call's duration
                  3.Received call's duration
                  4.Dialled call's duration
                  5.Clear Timers
                """);

    }
}



