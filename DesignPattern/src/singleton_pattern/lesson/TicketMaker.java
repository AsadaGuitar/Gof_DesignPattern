package singleton_pattern.lesson;

public class TicketMaker {

	private int ticket = 1000;
	private static TicketMaker ticketMaker = new TicketMaker();
	
	private TicketMaker() {}
	
	public int getNextTicketNumber() {
		return ticket++;
	}
	
	public static TicketMaker getInstance() {
		return ticketMaker;
	}
}
