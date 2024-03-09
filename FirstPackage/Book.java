package FirstPackage;

public class Book {
	int pageNum;
	String name;
	String cover; // should be a jpeg but will probably just be a randomly assigned picture
	
	Book(int pageNum, String name, String cover){
		this.pageNum = pageNum;
		this.name = name; 
		this.cover = cover;
	}
	public String printBook() {
		return "Name: " + this.name + "\n" + "Number of Pages: " + this.pageNum + "\n" + "Cover: " + this.cover + "\n";
	}
}

