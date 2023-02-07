package assessment02;

public class CertificationTester {
    public static void main(String[] args) {
        RegularCourseCertification r = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
        System.out.println("Regular Course Details");
        System.out.println("**************************************");
        System.out.println("Student Name: " + r.getStudentName());
        System.out.println("Course Name: " + r.getCourseName());
        System.out.println("Course Name: " + r.getDuration() +" Months");
        System.out.println("Registration ID: " + r.getRegistrationId());
        System.out.println("Total Fees: " + r.calculateFee());
        
        CrashCourseCertification c = new CrashCourseCertification("Roshan", "Angular", 71);
        System.out.println("\nCrash Course Details");
        System.out.println("**************************************");
        System.out.println("Student Name: " + c.getStudentName());
        System.out.println("Course Name: " + c.getCourseName());
        System.out.println("Course Name: " + c.getDuration() +" Months");
        System.out.println("Registration ID: " + c.getRegistrationId());
        System.out.println("Total Fees: " + c.calculateFee());
    }
}
