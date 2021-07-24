package main;

import java.io.IOException;

import adapter_pattern.Print;
import adapter_pattern.PrintAbs;
import adapter_pattern.PrintBanner;
import adapter_pattern.PrintBanner_;
import adapter_pattern.lesson.FileIO;
import adapter_pattern.lesson.FileProperties;
import iterator_pattern.Book;
import iterator_pattern.BookShelf;
import iterator_pattern.BookShelfIterator;
import iterator_pattern.Iterator;

public class Main {

	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("IteratorPattern"));
		bookShelf.appendBook(new Book("FactoryPattern"));
		bookShelf.appendBook(new Book("FactoryMethodPattern"));
		bookShelf.appendBook(new Book("AbstractFactoryPattern"));
		
		Iterator it = new BookShelfIterator(bookShelf);
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
		
		Print printer = new PrintBanner("PrintBanner");
		printer.printWeak();
		printer.printStrong();
		
		PrintAbs printerAbs = new PrintBanner_("PrintBanner_");
		printerAbs.printWeak();
		printerAbs.printStrong();
		
		String filePath = 
				"C:\\Users\\soroc\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\DesignPattern\\resources\\file.txt";
		FileIO fileIO = new FileProperties();
		try {
			fileIO.readFromFile(filePath);
			fileIO.setValue("year", "2004");
			fileIO.setValue("month", "4");
			fileIO.setValue("day", "21");
			fileIO.writeToFile("newfile.txt");
		} catch (IOException e) {
			System.err.printf(e.getMessage(), e);
		}
	}
}











