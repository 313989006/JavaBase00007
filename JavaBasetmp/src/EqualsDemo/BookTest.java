package EqualsDemo;

public class BookTest {

	public static void main(String[] args) {
		Book bookA=new Book("寂寞天使",50);
		Book bookB=new Book("Java必备",60);
		bookB=bookA;
		System.out.println(bookB.printfo());
		System.out.println(bookA.printfo());
	}
	}

