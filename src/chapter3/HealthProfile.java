package chapter3;

public class HealthProfile {
    private static String firstName;
    private static String lastName;
    private static int year;
    private int age ;
    private static String dateOfBirth;
    private static double patientWeight;
    private static double patientHeight;

    public static void setFirstName(String firstName) {
        HealthProfile.firstName = firstName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setLastName(String lastName) {
        HealthProfile.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void setDateOfBirth(int day, int month, int year) {
        HealthProfile.year = year;

        dateOfBirth = day + "/" + month + "/" + year;
    }

    public String GetDateOfBirth() {
        return dateOfBirth;
    }

    public int calculateAge() {
        age = 2022 - year;
        return age;
    }

    public int calculateTargetHeartRange() {
        return 220 - age;
    }

    public static double calculatePatientHeight(double heightConstant, int heightInInches) {
        patientHeight = heightConstant * heightInInches;
        return patientHeight;
    }

    public static double calculatePatientWeight(double weightConstant, int weightInPounds){
        patientWeight = weightConstant * weightInPounds;
        return patientWeight;
    }

    public double getPatientHeight() {
        return patientHeight;
    }

    public static String printOutPatientDetails(String firstName, String lastName, String dateOfBirth, double patientHeight, double patientWeight){
        HealthProfile.firstName = firstName;
        HealthProfile.lastName = lastName;
        HealthProfile.dateOfBirth = dateOfBirth;
        HealthProfile.patientHeight = patientHeight;
        HealthProfile.patientWeight = patientWeight;

        System.out.println("Patient's details are as follows: ");
        System.out.println();
        System.out.println("  1.Patient Name > " +firstName+ " " +lastName);
        System.out.println("  2.Date of birth > " +dateOfBirth);
        System.out.println("  3.Weight in kg > " +patientWeight);
        System.out.println("  4.Height in metres > " +patientHeight);
        String patientDetails = " ";
        return patientDetails;
    }

    public double getPatientWeight() { return patientWeight; }
}
