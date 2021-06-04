class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name, String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	//Returns the name
	public String getName() {
		return name;
	}
	
	//Returns the Gender character 
	public char getGender() {
		return gender;
	}
	
	//Returns the email
	public String getEmail() {
		return email;
	}
	
	//Sets the email
	public void setEmail(String email) {
		this.email=email;
	}
	
	//Return book-name by author-name (gender)at email
	public String to_String () {
		return name +" (" + gender + ")at" + email;
	}
	
}
class Book{
	private String name;
	private String author;
	private double price;
	private int qty;
	
	Book(String name,String author,double price, int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	
	public String getname() {
		return name;
		
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
		
	
	
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public  void setQty(int qty) {
		this.qty=qty;
	}
	
	public String to_String() {
		return "'"+ name + "by" + author;
	}
}
public class Q1 {

	public static void main(String[] args) {
		//creating object of Author function that talks name,email and gender as argument
		Author a = new Author("Tan Ah Teck","teck@somewhere.come",'m');
		System.out.println(a.to_String());
		
		//System.out.println("name is:" +a.getName());
		//System.out.println("gender is:" +a.getGender());
		//System.out.println("email is:" +a.getEmail());
		
		
		//Book Class
		Book b = new Book ("My first book","Malik Ahmed", 40,20);
		System.out.println(b.to_String());
		
		
	}

}
