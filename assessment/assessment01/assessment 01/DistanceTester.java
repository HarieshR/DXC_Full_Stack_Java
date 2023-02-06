package assessment;

public class DistanceTester {
	public static void main(String[] args) {
		DistanceCalculator p1 = new DistanceCalculator(2, 3);
		System.out.println("The distance of p1 from origin is: " + p1.distance());
		DistanceCalculator p2 = new DistanceCalculator(5, 6);
		System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
		}
}
