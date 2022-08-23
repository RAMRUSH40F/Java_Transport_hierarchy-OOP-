import java.util.Objects;
import java.util.concurrent.RecursiveTask;

public class Workday
{
    private boolean isStarted;
    private Integer fuelConsumption;
    private int fuel;

    public void start(int duration_hours)
    {
        System.out.println("Working day has started");
        fuel -= fuelConsumption*duration_hours;
        isStarted = true;

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        end();

    }

    public void end()
    {
        System.out.println("Working day has ended");
        isStarted = false;
    }


    Workday(Builder builder){
        this.fuelConsumption = Objects.requireNonNull(builder.fuelConsumption);
        this.fuel = Objects.requireNonNull(builder.fuel);
    }


    public static class Builder{

        private boolean isStarted;
        private Integer fuelConsumption;
        private int fuel;

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
