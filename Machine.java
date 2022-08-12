import java.util.Objects;

public class Machine {

    protected String name;
    protected int fuel;
    protected Engine engine;

    public String getName() {
        if (Objects.isNull(this.name)) return "null";
        return name;
    }

    public int getFuel() {
        return fuel;
    }
    Machine(){
    }
    protected  Machine(Builder builder){
        this.name = Objects.requireNonNull(builder.name, "name");
        this.fuel = builder.fuel;
        this.engine = builder.engine;
    }

    public static class Builder
    {
        private String name;
        private Integer fuel = 150;
        private Engine engine;
        private String engine_name;
        private Integer force_power;

        public Builder name (String name){
            this.name = name;
            return this;
        }
        public Builder fuel (int fuel){
            if (fuel>0) this.fuel = fuel;
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

        public Machine build(){
            this.engine = new Engine.Builder()
                    .name(this.engine_name)
                    .force_power(force_power)
                    .build();
            return new Machine(this); }
    }


    public void fill(int gasAmount)
    {
        System.out.println(this.name + " filled with gas. "+Integer.toString(fuel)+" -> "+Integer.toString(fuel+200));
        fuel += 200;

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
        System.out.println("Name: "+this.getName()+". Fuel: "+this.getFuel());
        if (Objects.nonNull(this.engine))
            System.out.println("Engine: "+this.engine.getName()+". Force: "+this.engine.getForce_power());
    }






}

