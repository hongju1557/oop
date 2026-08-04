package classes_ex;

//Book 클래스 정의
//접근 제어자 - public, private, default(생략)
public class Book {
	//필드
	private int bookNumber;
	private String bookTitle;
	
	//기본 생성자
	public Book() {};
	
	//매개변수(필드)가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle; 
	}
	
	//get(), set() 메서드 작성
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookTitle() {
		return bookTitle;
	}
}

