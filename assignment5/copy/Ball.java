package assignment5.copy;

public class Ball {
	private double x;
	private double y;

	Ball(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setXY() {
		System.out.println("The position of the ball is " + x + "," + y);
	}

	public void setXYSpeed(int speed) {
		System.out.println("The speed of the ball is at " + speed + "Km/hrs");
	}
public void move(double xDisp,double yDisp) {
	x=x+xDisp;
	y=y+yDisp;
	System.out.println("After changing the values of x & y is :- "+x+","+y);
}
public String toString() {
	return "Ball@("+x+","+y+")";
}
}
