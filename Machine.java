import lombok.Builder;

import java.util.Objects;

public class Machine {

    private final String name;
    private int fuel = 150;
    private Engine engine;

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getFuel() {
        return fuel;
    }

    private Machine(Builder builder){
        this.name = Objects.requireNonNull(builder.name, "name");
        this.fuel = Objects.requireNonNull(builder.fuel, "fuel_amount");
        this.engine = builder.engine;
    }

    public static class Builder
    {
        private String name;
        private int fuel = 150;
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
//        public Builder engine_name(String name, Integer force_power)
//        {
//            this.engine = new Engine.Builder()
//                    .force_power(force_power)
//                    .name(name)
//                    .build();
//            return this;
//        }

        public Machine build(){
            this.engine = new Engine.Builder()
                    .name(this.engine_name)
                    .force_power(force_power)
                    .build();
            return new Machine(this); }
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
        System.out.println("Name: "+this.getName()+". Fuel: "+this.getFuel());

        System.out.println("Engine: "+this.engine.getName()+". Force: "+this.engine.getForce_power());
    }






}

