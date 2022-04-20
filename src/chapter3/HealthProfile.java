package chapter3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int year;
    private int day;
    private int month;
    private String dateOfBirth =  day+ "/" +month+ "/" +year;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth ;

    }

    public String GetDateOfBirth() {
        return dateOfBirth;
    }
}
