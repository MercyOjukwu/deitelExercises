package chapter4;
import java.util.Scanner;

public class NokiaPhone {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);


        System.out.println(" ");
        int digit = input.nextInt();
        for (int number = 1; number <= 1; number++) {
            switch (number) {
                case 1:
                    System.out.println("List of menu functions:\n  1.Phone book\n  2.Messages\n  3.Chat\n  4.Call register\n ");
            }

            System.out.println();
            int firstEntry = input.nextInt();

            System.out.println(" 1.Phone Book > \n 1.Search\n 2.Service Nos.\n 3.Add name\n 4.Erase\n 5.Edit\n 6.Assign tone\n 7.Send b'card\n 8.Options\n 9.Speed dials\n 10.Voice tags");

            System.out.println(" ");
            int figure = input.nextInt();
            for (int number1 = 8; number1 <= 8; number1++) {
                switch (number1) {
                    case 8:
                        System.out.println("   1.Type of view\n   2.Memory Status");
                        break;
                }
            }

            System.out.println(" ");
            int figure1 = input.nextInt();
            for (int number1 = 11; number1 <= 11; number1++) {
                switch (number1) {
                    case 11:
                        System.out.println("List of menu functions:\n  1.Phone book\n  2.Messages\n  3.Chat\n  4.Call register\n  ");
                }

                System.out.println();
                int secondEntry = input.nextInt();

                for (int number2 = 2; number2 <= 2; number2++) {
                    switch (number2) {
                        case 2:
                            System.out.println("2.Messages >\n  1.Write Messages\n  2.Inbox\n  3.Outbox\n  4.Picture Messages\n  5.Templates\n  6.Smileys\n  7.Message Settings\n  8.Info service\n  9.Voice mailbox number\n  10.Service Command Editor\n");
                            break;
                    }


                    System.out.println();
                    int thirdEntry = input.nextInt();
                    for (int number4 = 7; number4 <= 7; number4++) {
                        switch (number4) {
                            case 7:
                                System.out.println("  1.Set\n   1.Message centre number\n   2.Messages sent as\n   3.Message validity\n  2.Common\n   1.Delivery reports\n   2.Reply via same centre\n   3.Character support\n");
                                break;
                        }


                        System.out.println(" ");
                        int figure2 = input.nextInt();
                        for (int number8 = 11; number8 <= 11; number8++) {
                            switch (number8) {
                                case 11:
                                    System.out.println("List of menu functions:\n  1.Phone book\n  2.Messages\n  3.Chat\n  4.Call register\n  ");
                            }


                        }


                        System.out.println(" ");
                        int figure3 = input.nextInt();
                        for (int number8 = 4; number8 <= 4; number8++) {
                            switch (number8) {
                                case 4:
                                    System.out.println("  1.Missed Calls\n  2.Received calls\n  3.Dialled Numbers\n  4.Erase recent call list\n  5.Show call duration\n  6.Show call costs\n  7.Call cost settings\n  8.Prepaid credits\n");
                            }


                        }


                        System.out.println(" ");
                        int figure4 = input.nextInt();
                        for (int number8 = 5; number8 <= 5; number8++) {
                            switch (number8) {
                                case 5:
                                    System.out.println("  1.Last call duration\n  2.All call's duration\n  3.Received call's duration\n  4.Dialled call's duration\n  5.Clear Timers\n");
                            }


                        }

                        System.out.println(" ");
                        int figure5 = input.nextInt();
                        for (int number9 = 44; number9 <= 11; number9++) {
                            switch (number9) {
                                case 44:
                                    System.out.println("1.Missed Calls\n  2.Received calls\n  3.Dialled Numbers\n  4.Erase recent call list\n  5.Show call duration\n  6.Show call costs\n  7.Call cost settings\n  8.Prepaid credits\n");

                            }


                        }


                        System.out.println(" ");
                        int figure6 = input.nextInt();
                        for (int number10 = 6; number10 <= 6 ; number10++){
                            switch(number10){
                                case 6:
                                    System.out.println("    1.Last call cost\n    2.All cost costs\n    3.Clear counters\n");}
                        }

                        System.out.println(" ");
                        int figure7 = input.nextInt();
                        for(int number11 = 7; number11 <= 7;number11++){
                            switch(number11){
                                case 7:
                                    System.out.println("    1.Call cost limit\n   2.Sow costs in\n");
                            }
                        }

                    }
                }

            }


        }

    }

}




