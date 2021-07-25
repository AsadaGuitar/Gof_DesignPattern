package main;

import java.io.IOException;

import adapter_pattern.Print;
import adapter_pattern.PrintAbs;
import adapter_pattern.PrintBanner;
import adapter_pattern.PrintBanner_;
import adapter_pattern.lesson.FileIO;
import adapter_pattern.lesson.FileProperties;
import builder_pattern.Director;
import builder_pattern.HTMLBuilder;
import builder_pattern.TextBuilder;
import factory_method_pattern.framework.Factory;
import factory_method_pattern.framework.Product;
import factory_method_pattern.idcard.IdCardFactory;
import iterator_pattern.Book;
import iterator_pattern.BookShelf;
import iterator_pattern.BookShelfIterator;
import iterator_pattern.Iterator;
import prototype_pattern.MessageBox;
import prototype_pattern.UnderlinePen;
import prototype_pattern.framework.Manager;
import prototype_pattern.framework.PrototypeProduct;
import singleton_pattern.Singleton;
import singleton_pattern.lesson.TicketMaker;
import template_method_pattern.AbstractDisplay;
import template_method_pattern.CharDisplay;
import template_method_pattern.StringDisplay;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Iterator_Pattern
		 */
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
		
		/*
		 * Adapter_Pattern
		 */
		//継承
		Print printer = new PrintBanner("PrintBanner");
		printer.printWeak();
		printer.printStrong();
		
		//委譲
		PrintAbs printerAbs = new PrintBanner_("PrintBanner_");
		printerAbs.printWeak();
		printerAbs.printStrong();
		
		//レッスン
		String filePath = 
				"C:\\Users\\soroc\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\"
				+ "DesignPattern\\resources\\file.txt";
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
		
		/*
		 * TemplateMethod_Pattern
		 */
		AbstractDisplay charDisplay = new CharDisplay('A');
		charDisplay.Display();
		AbstractDisplay strDisplay = new StringDisplay("Hello World !");
		strDisplay.Display();
		
		/*
		 * FactoryMethod_Pattern
		 */
		Factory factory = new IdCardFactory();
		Product card1 = factory.create("John");
		Product card2 = factory.create("Michael");
		Product card3 = factory.create("Kate");
		card1.use();
		card2.use();
		card3.use();
		
		/*
		 * Singleton_Pattern
		 */
		@SuppressWarnings("unused")
		Singleton singleton = Singleton.getInstance();
		
		//レッスン
		TicketMaker ticketMaker = TicketMaker.getInstance();
		System.out.println(ticketMaker.getNextTicketNumber());
		
		/*
		 * Prototype_Pattern
		 */
		Manager manager = new Manager();
		UnderlinePen underlinePen = new UnderlinePen('~');
		MessageBox asterBox = new MessageBox('*');
		MessageBox plusBox = new MessageBox('+');
		manager.register("strong line", underlinePen);
		manager.register("aster box", asterBox);
		manager.register("plus box", plusBox);
		
		PrototypeProduct p1 = null;
		PrototypeProduct p2 = null;
		PrototypeProduct p3 = null;
				
		try {
			p1 = manager.create("strong line");
			p2 = manager.create("aster box");
			p3 = manager.create("plus box");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			return;
		}
		
		p1.use("HELLO WORLD");
		p2.use("HELLO WORLD");
		p3.use("HELLO WORLD");
		
		/*
		 * Builder_Pattern
		 */
		TextBuilder textBuilder = new TextBuilder();
		Director textDirector = new Director(textBuilder);
		textDirector.construct();
		String resultText = textBuilder.getResult();
		System.out.println(resultText);
		
		HTMLBuilder htmlBuilder = new HTMLBuilder();
		Director htmlDirector = new Director(htmlBuilder);
		htmlDirector.construct();
		String resultHTML = htmlBuilder.getResult();
		System.out.println("ファイル : " + resultHTML + "を作成しました。");
	}
}











