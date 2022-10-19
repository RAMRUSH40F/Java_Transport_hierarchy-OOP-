import java.util.Objects;

public class CruiseShip extends Water_transport
{
    private final Integer capacity;
    private int numPeople;

    private CruiseShip(Builder builder)
    {
        this.name = Objects.requireNonNull(builder.name, "name");
        this.engine = builder.engine;
        this.capacity = Objects.requireNonNull(builder.capacity);
        this.location = builder.location;
        this.tonnage = Objects.requireNonNull(builder.tonnage, "tonnage");
        this.fuel = builder.fuel;
        this.maximumDistance = Objects.requireNonNull(builder.maximumDistance);
    }

    public void getOnBoard(int num_people)
    {
        int temp = this.numPeople + num_people;

        if (temp > this.capacity)
        {
            System.out.println(num_people - temp + capacity
                    + " out of " + num_people +
                    " got on the board. The ship is FULL.");
            this.numPeople = capacity;
        } else
            System.out.println("People got ON board: " + this.numPeople + " -> " + temp);
        this.numPeople = temp;

    }

    public void getOffBoard(int num_people)
    {
        int temp = this.numPeople - num_people;
        if (temp < 0)
        {
            System.out.println(this.numPeople + " people got OFF the " + this.name + ". The ship is EMPTY.");
            this.numPeople = 0;
        } else
        {
            System.out.println("People got OFF board: " + this.numPeople + " -> " + temp + ".");
            this.numPeople = temp;
        }

    }

    @Override
    public void info()
    {
        super.info();
        System.out.println("People in board: " + this.numPeople + " Capacity: " + this.capacity);
    }

    public static class Builder
    {
        private final Integer fuel       = 150;
        private final boolean sailedAway = false;
        private       String  name;

        private Integer tonnage, maximumDistance;
        private Integer capacity;
        private String  location;

        private Engine  engine;
        private String  engine_name;
        private Integer force_power;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder tonnage(Integer tonnage){
            this.tonnage = tonnage;
            return this;
        }
        public Builder maximumDistance(Integer maximumDistance){
            this.maximumDistance = maximumDistance;
            return this;
        }
        public Builder location(String location){
            this.location = location;
            return this;
        }
        public Builder numPeople(Integer numPeople){
            int numPeople1 = numPeople;
            return this;
        }
        public Builder engine_name(String engine_name){
            this.engine_name = engine_name;
            return this;
        }
        public Builder force_power (Integer force_power){
            this.force_power = force_power;
            return this;
        }

        public CruiseShip build()
        {
            Engine engine = new Engine.Builder()
                    .name(this.engine_name)
                    .force_power(this.force_power)
                    .build();
            if (Objects.nonNull(this.tonnage)) this.capacity = this.tonnage/100;
            return new CruiseShip(this);
        }
    }
}
