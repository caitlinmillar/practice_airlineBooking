import java.util.ArrayList;
import java.util.List;


public class Flight {
    private final String name;
    private Double price;
    private final List<City> destinationsAvailable;
    private ArrayList<Flight> seat;

    public Flight (String name, Double price, String seat){
        this.name = name;
        this.price = price;
        this.destinationsAvailable = new ArrayList<>();
        this.seat = new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<String> seats = new ArrayList<String>();
        seats.add("1A");
        seats.add("1B");
        seats.add("1C");
        seats.add("2A");
        seats.add("2B");
        seats.add("2C");

    }
    public String getSeat(ArrayList<Flight> seats) {
        int index = seats.size();
        return seats.toString();}


    public String getName(){return name;}

    public void addDestination(City destination){destinationsAvailable.add(destination);}
    public void removeDestination(City destination){destinationsAvailable.remove(destination);}

    public List<City> getDestinationsAvailable() {return destinationsAvailable;}

    public boolean isDestinationAvailable(City destination){
        for(City destinationAvailable : destinationsAvailable){
            if(destinationAvailable.equals(destination))
                return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}



