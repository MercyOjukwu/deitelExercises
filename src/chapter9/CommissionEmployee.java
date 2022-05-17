package chapter9;

public class CommissionEmployee extends Employee{
    private static int age;
    private static String gender;

    public static void main(String[] args) {
        CommissionEmployee.getAge();
    }

    public CommissionEmployee(int age, String gender){
        super("Mercy", "Oj","12345");
        CommissionEmployee.age = age;
        CommissionEmployee.gender = gender;
    }

    public static int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String toString(){
     return " ";
    }
}
