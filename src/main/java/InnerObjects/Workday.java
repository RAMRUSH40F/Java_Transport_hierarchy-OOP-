package InnerObjects;

import java.util.Objects;

public class Workday
{
    private final Integer fuelConsumption;
    private       boolean isStarted;
    private       int     fuel;

    // Pattern Builder in order to create an instance quick.
    Workday(Builder builder)
    {
        this.fuelConsumption = Objects.requireNonNull(builder.fuelConsumption);
        this.fuel = Objects.requireNonNull(builder.fuel);
    }

    public void end()
    {
        System.out.println("Working day has ended");
        isStarted = false;
    }

    public void start(int duration_hours)
    {
        System.out.println("Working day has started");
        fuel -= fuelConsumption * duration_hours;
        isStarted = true;

        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
        end();

    }

    public static class Builder{

        private boolean isStarted;
        private Integer fuelConsumption;
        private int     fuel;

        public Builder fuel(int fuel){
            this.fuel = fuel;
            return this;
        }

        public Builder fuelConsumption(Integer fuelConsumption){
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Workday build(){
            return new Workday(this);
        }

    }
}
