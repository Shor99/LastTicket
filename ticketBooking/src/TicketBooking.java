public class TicketBooking implements Runnable{

    private int ticketAvailable;

    public void setTicketAvailable(int ticketAvailable) {
        this.ticketAvailable = ticketAvailable;
    }

    public synchronized void takeTicket(int amount){

        if(ticketAvailable>0){
            System.out.println("Thread " + Thread.currentThread().getName() + " is about to take the ticket " +
                    amount);
            ticketAvailable--;
            System.out.println(" Thread " + Thread.currentThread().getName() + " has withdraw " + amount);

        }

    }

    @Override
    public void run() {

        takeTicket(1);

        if(ticketAvailable<0){
            System.out.println("Ticket was taken!");
        }

    }
}
