package sortLibrary;



public class LibrarySortByBookId implements Comparable<LibrarySortByBookId>{
	int book_id;
	String author_name;
	int publish_year;
	
	public LibrarySortByBookId() {
		super();
	}

	public LibrarySortByBookId(int book_id, String author_name, int publish_year) {
		super();
		this.book_id = book_id;
		this.author_name = author_name;
		this.publish_year = publish_year;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getPublish_year() {
		return publish_year;
	}

	public void setPublish_year(int publish_year) {
		this.publish_year = publish_year;
	}

	@Override
	public String toString() {
		return "Library [book_id=" + book_id + ", author_name=" + author_name + ", publish_year=" + publish_year + "]";
	}

	@Override
	public int compareTo(LibrarySortByBookId lib) {
		int x = this.book_id - lib.book_id; //sorting by book_id
		return x;
	}
	
	
}
