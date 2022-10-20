package Transport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Public_transportTest
{
    Public_transport bus;

    @BeforeEach
    void setUp()
    {
        bus = new Public_transport.Builder()
                .numPeople(0)
                .location("Leninskiy_avenue, 50")
                .tonnage(12000)
                .name("Bus503F")
                .maximumDistance(500)
                .engine_name("Volga-530")
                .force_power(600)
                .fuelConsumption(30)
                .build();

    }

    @Test
    void driveTo()
    {
        bus.driveTo("Nevsky av., 35");
    }

    @Test
    void info()
    {
        bus.info();
    }

    @Test
    void start()
    {
        bus.start();
    }

    @Test
    void getNumOfInstances()
    {

    }

    @Test
    void stop()
    {
        bus.stop();
    }

    @Test
    void getOnBoard()
    {
        bus.getOnBoard(5);
        bus.getOnBoard(6);
    }

    @Test
    void getOffBoard()
    {
        bus.getOffBoard(5);
        bus.getOffBoard(6);
    }
}