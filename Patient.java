import java.lang.reflect.Field;
public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phonenumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phonenumber) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("Error : Please fill your id again");
        }
        this.name = name;
        if (birthYear <= 2024) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Maybe your birtYear again");
        }
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Maybe your height again");
            this.height = -height;
        }
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Maybe your weight again");
            this.weight = -weight;

        }
        if (bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O")) {
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Invalid BloodGroup");
            this.bloodGroup = "null";
        }
        if (phonenumber.length() == 10) {
            this.phonenumber = phonenumber;
        } else {
            System.out.println("Invalid PhoneNumber");
            this.phonenumber = "null";
        }
    }
        public int getAge(int currentYear){
            if (currentYear > birthYear) {
                return currentYear - birthYear;
            } else {
                System.out.println("! warning ! ---Please fill this form correctly---");
                return -1;
            }
        }
        public String getbloodgroup () {
            return bloodGroup;
        }
        public String getPhonenumber () {
            return phonenumber;
        }

        public double getBMI () {
            if (height <= 0 || weight <= 0) {
                return 0.0;
            } else {
                double heightInM = height / 100.0;
                return weight / (heightInM * heightInM);
            }
        }

        public void displayDetails ( int currentYear){
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + getAge(currentYear));
            System.out.println("Patient Height (cm): " + height);
            System.out.println("Patient Weight (kg): " + weight);
            System.out.println("Patient BloodGroup : " + getbloodgroup());
            System.out.println("Patient PhoneNumbe: " + getPhonenumber());
            System.out.println("Patient BMI: " + getBMI());
        }
    }



