import lombok.Builder;

@Builder
public class Machine {

    String name;

    int fuel = 150;
    Engine engine;

    @Builder
    Machine()
    {
        engine = Engine.builder()
                .build();
        this.name = "Unstated";
    }
    @Builder
    Machine(String name)
    {
        engine = Engine.builder()
                .build();
        this.name = name;
    }

    @Builder
    Machine(String name, String engine_name)
    {
        engine = Engine.builder()
                .name(engine_name)
                .build();

        this.name = name;
    }
    @Builder
    Machine(String name, Integer engine_force)
    {
        engine = Engine.builder()
                .force_power(engine_force)
                .build();
        this.name = name;
    }

    @Builder
    Machine(String name, String engine_name, Integer engine_force)
    {
        engine = Engine.builder()
                .name(engine_name)
                .force_power(engine_force)
                .build();
        this.name = name;
    }

    public void fill(int gasAmount)
    {
        fuel += 200;
        System.out.println(name+" filled up with gas.");
    }

    public void start()
    {
        System.out.println("Turn a key!");
        engine.start();
        fuel -= 50;
    }

    public void stop()
    {
        System.out.println("Light are turned off");
        engine.stop();
    }

    public void info()
    {
        System.out.println("Engine: "+this.name+". Force: "+this.engine.force_power+". Fuel: "+this.fuel);
    }






}

