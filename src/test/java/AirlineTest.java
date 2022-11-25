
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class AirlineTest {
    Airline airline;
    Customer customer;
    Flight flight;

    @BeforeEach
    public void setUp() {
        airline = new Airline("Boeing 747-400");
        customer = new Customer("Hannah Montana", 7500);
        flight = new Flight("Flight to Rome", 2500.0, "3C");
    }

    @Test
    public void sellFlight() {
        airline.sellFlight(airline, customer);
    }

    @Test
    public void price() {assertThat(flight.getPrice()).isEqualTo(2500.0);}

    @Test
    void name() {
        assertThat(airline.getName()).isEqualTo("Boeing 747-400");
    }

    @Test
    void airlineMoney() {
        assertThat(airline.getAirlineMoney()).isEqualTo(100_000);
    }

}


