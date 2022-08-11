import lombok.Builder;

@Builder
public abstract class Water_transport extends Machine
{
    Integer tonnage, maximumDistance;
    String location, name;
    boolean sailedAway;
    int fuel = 150;
    Engine engine;



    public void goSailing(String location)
    {
        System.out.println(name+" goes from "+this.location+" to " +location);
        this.location = location;
        this.fuel -=50;
    }

    @Override
    public void info()
    {
        super.info();
        System.out.println(". Fuel: "+this.fuel+". Tonnage: "+this.tonnage +". Max distance: "+this.maximumDistance);

        if (this.sailedAway)
            System.out.println("In sail to "+this.location);
        else
            System.out.println("In a port of "+this.location);


    }



}
