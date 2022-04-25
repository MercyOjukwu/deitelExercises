package chapter3;
import java.util.Scanner;


public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first name: ");
        String firstName = input.next();

        System.out.println("Enter last name: ");
        String lastName = input.next();

        System.out.println("Enter date of birth in this format dd/mm/yyyy : ");
        split(input.next());
        int day = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter height in inches: ");
        int heightInInches  = input.nextInt();

        System.out.println("Enter weight in pounds: ");
        int weightInPounds = input.nextInt();

        String dateOfBirth = day+ "/" +month+ "/" +year;
        HealthProfile.setFirstName(firstName);
        HealthProfile.setLastName(lastName);
        HealthProfile.setDateOfBirth(day, month, year);
        double patientHeight =  (HealthProfile.calculatePatientHeight(0.0254, heightInInches));
        double patientWeight =  (HealthProfile.calculatePatientWeight(0.453592, weightInPounds));

        System.out.println(HealthProfile.printOutPatientDetails(firstName, lastName, dateOfBirth, patientHeight, patientWeight));
    }

    private static void split(String dateOfBirth) {


    }
}
