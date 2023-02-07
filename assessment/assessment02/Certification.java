package assessment02;
//import java.util.Random;

public interface Certification {
	  double REGULAR_COURSE_FEE = 2000;
	  double CRASH_COURSE_FEE = 5000;
	  double calculateFee();
	}
abstract class RRTechnicalCertification implements Certification {
		private String studentName;
		private String courseName;
		private int registrationId;
		private int admissionTestMarks;
		private static int counter = 1000;
		private int duration;
		
	  public abstract void generateRegistrationId();

	  public double calculateFee() {
	    double discountedFee = 0.0;
	    if (admissionTestMarks >= 90) {
	      discountedFee = (duration * REGULAR_COURSE_FEE) * (1 - 0.10);
	    } else if (admissionTestMarks >= 75) {
	      discountedFee = (duration * REGULAR_COURSE_FEE) * (1 - 0.05);
	    } else {
	      discountedFee = duration * REGULAR_COURSE_FEE;
	    }
	    return discountedFee;
	  }

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}

	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		RRTechnicalCertification.counter = counter;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	}

class RegularCourseCertification extends RRTechnicalCertification {
  public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int duration) {
    this.setStudentName(studentName);
    this.setCourseName(courseName);
    this.setAdmissionTestMarks(admissionTestMarks);
    this.setDuration(duration);
    generateRegistrationId();
  }
  static {
	  setCounter(getCounter() + 1);
  }
  public void generateRegistrationId() {
    this.setRegistrationId(getCounter());
  }
}
 class CrashCourseCertification extends RRTechnicalCertification {
  public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
	    this.setStudentName(studentName);
	    this.setCourseName(courseName);
	    this.setAdmissionTestMarks(admissionTestMarks);
	    this.setDuration(2);

    generateRegistrationId();
  }
  static {
	  setCounter(getCounter() + 1);
  }

  public void generateRegistrationId() {
	  this.setRegistrationId(getCounter());
  }

  public double calculateFee() {
    double discountedFee = super.calculateFee();
    discountedFee += discountedFee * 0.1236;
    return discountedFee;
  }
}
