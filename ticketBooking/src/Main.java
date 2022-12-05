public class Main {
    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.setTicketAvailable(1);

        Thread pass1 = new Thread(ticketBooking);
        Thread pass2 = new Thread(ticketBooking);

        pass1.setName("Or");
        pass2.setName("Bar");

        pass1.start();
        pass2.start();
    }
}