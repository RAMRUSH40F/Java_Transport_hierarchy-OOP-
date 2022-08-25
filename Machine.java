import java.util.Objects;

public class Machine {

    static        int    counter;
    private final int    id;
    protected     String name;
    protected     int    fuel;
    protected     Engine engine;

    Machine() {
        counter++;
        this.id = counter;
    }

    protected Machine(Builder builder) {
        this.name = Objects.requireNonNull(builder.name, "name");
        this.fuel = builder.fuel;
        this.engine = builder.engine;

        counter++;
        this.id = counter;
    }

    public static int getNumOfInstances() {
        return counter;
    }

    public String getName() {
        if (Objects.isNull(this.name))
            return "null";
        return name;
    }

    @Override
    public String toString() {

        return Objects.toString(this.getClass()).substring(6) + " " + this.getName() + ": " + this.hashCode();
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Machine))
            return false;
        return this.hashCode() == obj.hashCode();

    }

    @Override
    public int hashCode() {
        return id + 1923;
    }

    public int getId() {
        return id;
    }

    public void fill(int gasAmount) {
        System.out.println(this.name + " filled with gas. " + fuel + " -> " + (fuel + 200));
        fuel += 200;

    }

    public void start() {
        System.out.println("Turn a key!");
        engine.start();
        fuel -= 50;
    }

    public static class Builder {
        private String  name;
        private Integer fuel = 150;
        private Engine  engine;
        private String  engine_name;
        private Integer force_power;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder fuel(int fuel) {
            if (fuel > 0)
                this.fuel = fuel;
            return this;
        }
        public Builder engine_name(String name)
        {
            this.engine_name = name;
            return this;
        }
        public Builder force_power(Integer force_power)
        {
            this.force_power = force_power;
            return this;
        }

        public Machine build() {
            this.engine = new Engine.Builder()
                    .name(this.engine_name)
                    .force_power(force_power)
                    .build();
            return new Machine(this);
        }
    }

    public void stop()
    {
        System.out.println("Light are turned off");
        engine.stop();
    }

    public void info()
    {
        System.out.println("Name: "+this.getName()+". Fuel: "+this.getFuel());
        if (Objects.nonNull(this.engine))
            System.out.println("Engine: "+this.engine.getName()+". Force: "+this.engine.getForce_power());
    }






}

