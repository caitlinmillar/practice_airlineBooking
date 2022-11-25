import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {
    Flight flight;
    Customer customer;

    @BeforeEach
    public void setUp() {
        flight = new Flight("Flight to Rome", 2072.0, "1C");
    }

    @Test
    public void hasName() {
        assertThat(flight.getName()).isEqualTo("Flight to Rome");
    }

    @Test
    public void hasPrice() {
        assertThat(flight.getPrice()).isEqualTo(2072.0);
    }


}


