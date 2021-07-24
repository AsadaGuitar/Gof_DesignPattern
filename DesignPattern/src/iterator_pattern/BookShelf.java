package iterator_pattern;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
	
	private ArrayList<Book> books;
	
	public BookShelf() {
		this.books = new ArrayList<>();
	}
	
	public void appendBook(Book book) {
		this.books.add(0, book);
	}
	
	public Book getBookAt(int index) {
		return this.books.get(index);
	}
	
	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
