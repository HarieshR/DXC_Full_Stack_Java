package assessment02;

public class CourseRegistration {
	  private String studentName;
	  private int registrationId;
	  private float qualifyingMarks;
	  private double courseFee;
	  private int courseId;
	  private boolean hostelRequired;

	  public void setStudentName(String studentName) {
	    this.studentName = studentName;
	  }

	  public void setRegistrationId(int registrationId) {
	    this.registrationId = registrationId;
	  }

	  public void setQualifyingMarks(float qualifyingMarks) {
	    this.qualifyingMarks = qualifyingMarks;
	  }

	  public void setCourseId(int courseId) {
	    this.courseId = courseId;
	  }

	  public void setHostelRequired(boolean hostelRequired) {
	    this.hostelRequired = hostelRequired;
	  }

	  public String getStudentName() {
	    return studentName;
	  }

	  public int getRegistrationId() {
	    return registrationId;
	  }

	  public float getQualifyingMarks() {
	    return qualifyingMarks;
	  }

	  public double getCourseFee() {
	    return courseFee;
	  }
	  public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public int getCourseId() {
	    return courseId;
	  }

	  public boolean isHostelRequired() {
	    return hostelRequired;
	  }

	  public boolean validateMarks() {
	    if (qualifyingMarks >= 65 && qualifyingMarks <= 100) {
	      return true;
	    } else {
	      return false;
	    }
	  }

	  public boolean validateCourseId() {
	    if (courseId >= 1001 && courseId <= 1005) {
	      return true;
	    } else {
	      return false;
	    }
	  }

	  public void calculateCourseFee() {
	    if (validateMarks()) {
	      if (qualifyingMarks >= 85) {
	        courseFee = courseFee - (courseFee * 0.15);
	      } else if (qualifyingMarks >= 70) {
	        courseFee = courseFee - (courseFee * 0.10);
	      } else {
	        courseFee = courseFee - (courseFee * 0.05);
	      }
	    }
	  }
	}

	