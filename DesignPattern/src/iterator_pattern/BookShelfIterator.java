package iterator_pattern;

public class BookShelfIterator implements Iterator{
	
	private BookShelf bookShelf;
	private int index = 0;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
