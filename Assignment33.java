package assignment;

public class Assignment33 {
	static final double pi = 3.14;

	public void radius1() {
		int r1 = 7;

		double area1 = pi * r1;
		System.out.println(area1);
	}

	public void radius2() {
		int r2 = 14;

		double area2 = pi * r2;
		System.out.println(area2);
	}

	public static void main(String[] args) {
		Assignment33 obj = new Assignment33();
		System.out.println("Area of the first circle1: ");
		obj.radius1();
		System.out.println("Area of the first circle2: ");
		obj.radius2();
	}

}
