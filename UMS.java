public class UMS {
    public static void main(String[] args) {
        // Create a Student Object
        Student student = new Student(12, "Harman", 9.09);

        // Display Initial details
        student.displayDetails();

        // Modify CGPA using setter method
        student.setCgpa(9.5);

        // Display updated details
        System.out.println("After Updating CGPA:");
        student.displayDetails();

        // Creating a Postgraduate class object
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent(10, "Aryan", 9.25, "Computer Science");

        // Display postgraduate student details
        postgraduateStudent.displayPGdetails();
    }
}
class Student {
    public int StudentRollNumber;
    protected String StudentName;
    private double cgpa;

    // Constructor
    public Student(int StudentRollNumber, String StudentName, double cgpa) {
        this.StudentRollNumber = StudentRollNumber;
        this.StudentName = StudentName;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Public method  to set/update CGPA
    public void setCgpa(double newCgpa) {
        if(newCgpa >= 0 && newCgpa <= 10.0) {
            this.cgpa = newCgpa;
        }
        else {
            System.out.println("Invalid CGPA");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + StudentRollNumber);
        System.out.println("StudentName: " + StudentName);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
}

class PostgraduateStudent extends Student {
    // Variable
    private final String StudentField;

    // Constructor
    public PostgraduateStudent(int StudentRollNumber, String StudentName, double cgpa, String StudentField) {
        super(StudentRollNumber, StudentName, cgpa);
        this.StudentField = StudentField;
    }

    // Method to display student details
    public void displayPGdetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + StudentRollNumber);
        System.out.println("StudentName: " + StudentName); // Accessing protected member from superclass
        System.out.println("StudentField: " + StudentField);
        System.out.println("CGPA: " + getCgpa()); // Accessing private variable via public method
        System.out.println();
    }
}

//output
//Roll Number: 12
//StudentName: Harman
//CGPA: 9.09
//
//After Updating CGPA:
//Roll Number: 12
//StudentName: Harman
//CGPA: 9.5
//
//Postgraduate Student Details:
//Roll Number: 10
//StudentName: Aryan
//StudentField: Computer Science
//CGPA: 9.25

