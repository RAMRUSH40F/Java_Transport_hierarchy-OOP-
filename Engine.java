import lombok.Builder;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Engine
{
    private String name;
    private Integer force_power;
    private boolean started;


    public String getName() {
        return name;
    }

    public Integer getForce_power() {
        return force_power;
    }
    private Engine(@NotNull Builder builder){
        this.name = Objects.requireNonNull(builder.name, "name");
        this.started = Objects.requireNonNull(builder.started, "Started?");
        this.force_power = Objects.requireNonNull(builder.force_power, "Force power");
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

//    Engine()
//    {
//        this.name = "Unstated";
//        this.force_power = null;
//    }
//    Engine(String name){
//        this.name = name;
//        this.force_power = null;
//
//    }
//
//    Engine(Integer force_power){
//        this.name = "Unstated";
//        this.force_power = force_power;
//
//    }
//    Engine(String name, Integer force_power){
//        this.name = name;
//        this.force_power = force_power;
//
//    }

    public void start()
    {
        if (!started)
        {
        this.started  = true;
        System.out.println("Engine started!");
        }
        else{
            System.out.println("Engine is already working!");
        }
    }

    public void stop()
    {
        if (started)
        {
            this.started  = false;
            System.out.println("Engine stopped!");
        }
        else{
            System.out.println("Engine is not working!");
        }
    }

    public void info()
    {
        System.out.println("Engine name: "+this.name+". Engine force: "+this.force_power);
    }
}
