import lombok.Builder;
@Builder
public class Engine
{
    String name;
    Integer force_power;

    boolean started;


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
