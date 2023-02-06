package assessment;

public class DistanceCalculator {
	private int x;
	private int y;
	
	public DistanceCalculator(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public double distance() {
	    return(Math.sqrt(x*x + y*y));
	}

	public double distance(DistanceCalculator point) {
	    int xDiff = x - point.x;
	    int yDiff = y - point.y;
	    return(Math.sqrt(xDiff*xDiff + yDiff*yDiff));
	}

	public int getX() {
	    return x;
	}

	public int getY() {
	    return y;
	}

}
