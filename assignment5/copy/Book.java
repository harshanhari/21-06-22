package assignment5.copy;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qtyInStock) {
		// TODO Auto-generated constructor stub
		this(name, author, price);
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString() {
		return name+" by "+author.toString();
	}

}