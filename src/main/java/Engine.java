import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Engine
{
    private final String  name;
    private final Integer force_power;
    private       boolean started = false;

    // Getters, Setters, constructors

    public String getName()
    {
        if (Objects.isNull(this.name))
            return "Not_stated";
        return name;
    }

    public Integer getForce_power()
    {
        return force_power;
    }

    public boolean isStarted() {
        return started;
    }
    private Engine(@NotNull Builder builder){
        this.name = builder.name;
        this.started = builder.started;
        this.force_power = builder.force_power;
    }

    public static class Builder
    {
        private String name;
        private Integer force_power;
        private boolean started;

        public Builder force_power (Integer force_power){
            this.force_power = force_power;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder started(boolean started)
        {
            this.started = started;
            return this;
        }
         public Engine build() { return  new Engine(this); }
    }
    // These constructors were replaced by a special @Builder.

//    src.main.java.Engine()
//    {
//        this.name = "Unstated";
//        this.force_power = null;
//    }
//    src.main.java.Engine(String name){
//        this.name = name;
//        this.force_power = null;
//
//    }
//
//    src.main.java.Engine(Integer force_power){
//        this.name = "Unstated";
//        this.force_power = force_power;
//
//    }
//    src.main.java.Engine(String name, Integer force_power){
//        this.name = name;
//        this.force_power = force_power;
//
//    }



    public void start()
    {
        if (!started)
        {
            this.started = true;
            System.out.println("src.main.java.Engine started!");
        }
        else{
            System.out.println("src.main.java.Engine is already working!");
        }
    }

    public void stop()
    {
        if (started)
        {
            this.started = false;
            System.out.println("src.main.java.Engine stopped!");
        }
        else{
            System.out.println("src.main.java.Engine is not working!");
        }
    }

    public void info()
    {
        System.out.println(
                "src.main.java.Engine name: " + this.name + ". src.main.java.Engine force: " + this.force_power);
    }
}
