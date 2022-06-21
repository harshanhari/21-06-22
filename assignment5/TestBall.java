package assignment5;

public class TestBall {

	public static void main(String[] args) {
Ball b1=new Ball(20, 30);
System.out.println(b1.toString());
b1.setXY();
b1.setXYSpeed(60);
b1.move(5, 10);
System.out.println(b1.toString());
	}

}
