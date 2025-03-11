public class CourseManagement {
    public static void main(String [] args) {
        CourseData course1 = new CourseData("Java Programming",2,5000);
        CourseData course2 = new CourseData("C++ Programming",3,6000);
        course1.displayCourseDetail();
        course2.displayCourseDetail();
        CourseData.updateInstituteName("XYZ Institute");
        System.out.println("After name change");
        course1.displayCourseDetail();
        course2.displayCourseDetail();
    }
}
//defining the CourseData class
class CourseData{
    String CourseName;
    int CourseDuration;
    int CourseFee;
    static String InstituteName = "Chitkara University";
    //constructor for CourseData
    public CourseData(String CourseName,int CourseDuration,int CourseFee){
        this.CourseName = CourseName;
        this.CourseDuration = CourseDuration;
        this.CourseFee = CourseFee;
    }

    // Instance method to display course details
    public void displayCourseDetail() {
        System.out.println("Institute Name: " + InstituteName);
        System.out.println("Course Name: " + CourseName);
        System.out.println("Duration: " + CourseDuration + " years");
        System.out.println("Fee: " + CourseFee);
        System.out.println();
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        InstituteName = newInstituteName;
    }
}

//output
// Institute Name: Chitkara University
//Course Name: Java Programming
//Duration: 2 years
//Fee: 5000
//
//Institute Name: Chitkara University
//Course Name: C++ Programming
//Duration: 3 years
//Fee: 6000
//
//After name change
//Institute Name: XYZ Institute
//Course Name: Java Programming
//Duration: 2 years
//Fee: 5000
//
//Institute Name: XYZ Institute
//Course Name: C++ Programming
//Duration: 3 years
//Fee: 6000
