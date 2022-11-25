import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Airline> flight;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.flight = new ArrayList<>();
    }

    public boolean canBuy(Airline flight){
        if(flight.price() <= this.wallet){
            return true;
        }
        return false;
    }

    public void buyFlight(Airline flight){
        this.wallet -= flight.price();
        this.flight.add(flight);
    }

    public String getName(String name){
        return name;
    }

    public double getWallet(){return wallet;}
    public void setWallet(double wallet){this.wallet = wallet;}

    public ArrayList<Airline> getFlightBooked(){return flight;}
    public void setFlightBooked(ArrayList<Airline> flightBooked) {this.flight = flightBooked;}

}

