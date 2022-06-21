package assignment5.copy;

public class Circle {
double radius;
String color;
public Circle() {
	// TODO Auto-generated constructor stub
}
Circle(int radius){
	this.radius=radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
double getArea() {
	return Math.PI*radius*radius;
}

}
