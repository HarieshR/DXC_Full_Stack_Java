package assignment_week_2;

class Participant {
	private static int counter;
	private String registrationId, name, city;
	private long contactNumber;
	
	static {
		counter = 10000;
	}
	public Participant(String name, long contactNumber, String city ) {
		this.registrationId = "D"+ ++counter;
		this.name = name;
		this.city = city;
		this.contactNumber = contactNumber;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
}
public class DanceClubParticipants {
	public static void main(String[] args) {
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		Participant[] participants = { participant1, participant2 };
		for (Participant participant : participants) {
		System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}
	}
}
