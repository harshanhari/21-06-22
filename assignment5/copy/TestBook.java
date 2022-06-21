package assignment5.copy;

public class TestBook {

	public static void main(String[] args) {
Author a1=new Author("M.Van Bastan","vanbastan09@gmail.com",'m');
Author a2=new Author("P.Juvana","peterjuvana01@gmail.com",'f');
Book b1=new Book("My Real Story", a1, 300.0,5);
Book b2=new Book("Love Story", a2, 450.0);
System.out.println(b1.toString());
System.out.println(b2.toString());
System.out.println(b1.getName());
System.out.println(b2.getQtyInStock());
	}

}
