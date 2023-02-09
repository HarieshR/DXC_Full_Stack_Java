package assessment03;

public class TeacherTester {
	 public static void main(String[] args) {
		 
	        Teacher t1 = new Teacher("Alex", "Java Fundamentals", 1200L);
	        Teacher t2 = new Teacher("John", "RDBMS", 800L);
	        Teacher t3 = new Teacher("Sam", "Networking", 900L);
	        Teacher t4 = new Teacher("Maria", "Python", 900L);

	        Teacher[] teachers = {t1, t2, t3, t4};

	        for (Teacher teacher : teachers) {
	            System.out.print("\nName: " + teacher.getTeacherName());
	            System.out.print(", Subject: " + teacher.getSubject());
	            System.out.print(", Salary: " + teacher.getSalary());
	        }
	    }
}
