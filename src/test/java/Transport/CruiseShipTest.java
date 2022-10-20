package Transport;

import InnerObjects.Engine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CruiseShipTest
{
    Engine     LexusRT19;
    CruiseShip Victoria;

    @BeforeEach
    void setUp()
    {
        LexusRT19 = new Engine.Builder()
                .name("LexusRT19")
                .force_power(600)
                .started(false)
                .build();
        Victoria = new CruiseShip.Builder()
                .numPeople(0)
                .location("San-francisco")
                .tonnage(12000)
                .name("Victoria")
                .maximumDistance(500)
                .engine_name("RPV-50")
                .force_power(600)
                .build();
    }

    @Test
    void getOnBoard()
    {

        Victoria.getOnBoard(30);

    }

    @Test
    void sail()
    {

        Victoria.getOnBoard(30);
        Victoria.sail("New York");
    }

    @Test
    void getOffBoard()
    {
        Victoria.getOnBoard(30);
        Victoria.getOffBoard(20);
//        asser Victoria.getOffBoard(100);
    }

    @Test
    void info()
    {
        setUp();
        Victoria.getOnBoard(30);
        Victoria.getOffBoard(20);
        Victoria.info();
    }

    @Test
    void start()
    {
        Victoria.start();
    }
}