package InnerObjects;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Engine
{
    private final String  name;
    private final Integer force_power;
    private       boolean started = false;

    // Pattern Builder.
    private Engine(@NotNull Builder builder)
    {
        this.name = builder.name;
        this.started = builder.started;
        this.force_power = builder.force_power;
    }

    // Start/stop the engine.
    public void start()
    {
        if (!started)
        {
            this.started = true;
            System.out.println("InnerObjects.Engine started!");
        } else
        {
            System.out.println("InnerObjects.Engine is already working!");
        }
    }

    public void stop()
    {
        if (started)
        {
            this.started = false;
            System.out.println("Engine stopped!");
        } else
        {
            System.out.println("Engine is not working already!");
        }
    }

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

    public boolean isStarted()
    {
        return started;
    }

    public void info()
    {
        System.out.println(
                "Engine name: " + this.name + ". Engine force: " + this.force_power);
    }

    public static class Builder
    {
        private String  name;
        private Integer force_power;
        private boolean started;

        public Builder force_power(Integer force_power)
        {
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

        public Engine build()
        {
            return new Engine(this);
        }
    }

}
