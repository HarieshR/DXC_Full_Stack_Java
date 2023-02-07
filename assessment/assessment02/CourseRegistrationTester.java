package assessment02;

public class CourseRegistrationTester {
	public static void main(String[] args) {
	    CourseRegistration cr = new CourseRegistration();

	    cr.setStudentName("Peter");
	    cr.setRegistrationId(5001);
	    cr.setQualifyingMarks(58);
	    cr.setCourseId(1006);
	    cr.setHostelRequired(true);

	    if(cr.validateMarks()) {
	      if(cr.validateCourseId()) {
	        double baseFee;

	        switch(cr.getCourseId()) {
	          case 1001:
	            baseFee = 55000;
	            break;
	          case 1002:
	            baseFee = 35675;
	            break;
	          case 1003:
	            baseFee = 28300;
	            break;
	          case 1004:
	            baseFee = 22350;
	            break;
	          case 1005:
	            baseFee = 115000;
	            break;
	          default:
	            baseFee = 0;
	        }

	        cr.setCourseFee(baseFee);
	        cr.calculateCourseFee();

	        System.out.println("Name: " + cr.getStudentName());
	        System.out.println("Registration Id: " + cr.getRegistrationId());
	        System.out.println("Qualifying Exam Marks: " + cr.getQualifyingMarks());
	        System.out.println("Course Id: " + cr.getCourseId());
	        System.out.println("Hostel Required: " + cr.isHostelRequired());
	        System.out.println("Course Fee: " + cr.getCourseFee());
	      }
	    } else {
	      System.out.println("Marks is less than 65. You are not eligible for admission");
	    }
	  }
	}