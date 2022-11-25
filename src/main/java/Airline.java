import java.util.ArrayList;

public class Airline {
    private String name;
    private int airlineMoney;
    private ArrayList<Flight> flightBooking;
    private double price;

    public Airline(String name){
        this.name = name;
        this.airlineMoney = 100_000;
        this.flightBooking = new ArrayList<>();
    }

    public void sellFlight(Airline flight, Customer customer){
        if(customer.canBuy(flight)){
            customer.buyFlight(flight);
            this.flightBooking.remove(flight);
            setAirlineMoney(this.airlineMoney + flight.price());
        }
    }

    double price() {
        return price;
    }

    public String getName(){return name;}

    public int getAirlineMoney(){return airlineMoney;}
    public void setAirlineMoney(double airlineMoney){this.airlineMoney = (int) airlineMoney;}

    public ArrayList<Flight> getFlightBooking(){return flightBooking;}
    public void setFlightBooking(ArrayList<Flight> flights) {this.flightBooking = flights;}

    public double getPrice() {
        return this.price();}

    public void setPrice(double price){this.price = price;}

}
