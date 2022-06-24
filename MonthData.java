package test;

public class MonthData {
	private String name;
	private int distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public MonthData(String name, int distance) {
		setName(name);
		setDistance(distance);
	}

	@Override
	public String toString() {
		return "[" + name + ", " + distance + "]";
	}
}
