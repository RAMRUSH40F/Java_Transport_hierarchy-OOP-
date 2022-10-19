import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EngineTest
{


    @Test
    void start()
    {
        Engine LexusRT20 = new Engine.Builder()
                .name("LexusRT20")
                .force_power(600)
                .started(false)
                .build();
        Engine LexusRT19 = new Engine.Builder()
                .name("LexusRT19")
                .force_power(600)
                .started(false)
                .build();

        LexusRT20.start();

        assertNotNull(LexusRT20);
        assertEquals(LexusRT20, LexusRT19);
    }

    @Test
    void stop()
    {
    }

    @Test
    void info()
    {
    }
}