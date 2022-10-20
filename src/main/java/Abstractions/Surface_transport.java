package Abstractions;

public abstract class Surface_transport extends Machine
{
    protected Integer maximumDistance, weight;
    protected String  location;
    protected boolean on_the_way = false;

    final public void driveTo(String location)
    {
        System.out.println(name + " started a route from " + this.location + " to " + location);
        this.location = location;
        this.fuel -= 50;
    }

    // Overriding info() text.
    @Override
    public void info()
    {
        super.info();
        System.out.println("Weight: " + this.weight + ". Max distance: " + this.maximumDistance);
    }

}
