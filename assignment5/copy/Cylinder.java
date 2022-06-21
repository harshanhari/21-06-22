package assignment5.copy;

public class Cylinder extends Circle{
double hight;
Cylinder(){
	
}
Cylinder(double radius){
	this.radius=radius;
}
Cylinder(double radius,double hight){
	this(radius);
	this.hight=hight;
}
public double getHight() {
	return hight;
}
public double getVolume() {
	return Math.PI*radius*radius*hight;
}

}
