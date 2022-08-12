public abstract class Water_transport extends Machine
{
    protected Integer tonnage, maximumDistance;
    protected String location;
    private boolean sailedAway;


    final public void sail(String location)
    {
        System.out.println(name+" goes from "+this.location+" to " +location);
        this.location = location;
        this.fuel -=50;
    }

    @Override
    public void info()
    {
        super.info();
        System.out.println("Tonnage: "+this.tonnage +". Max distance: "+this.maximumDistance);

        if (this.sailedAway)
            System.out.println("On the way to "+this.location);
        else
            System.out.println("In "+this.location);


    }



}
