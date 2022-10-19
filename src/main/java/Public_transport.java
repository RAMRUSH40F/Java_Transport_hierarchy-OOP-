import java.util.Objects;

public class Public_transport extends Surface_transport {

    private final Workday work;
    private final Integer capacity;
    protected     Integer tonnage;
    private       int     numPeople;

    private Public_transport(Builder builder) {
        this.name = Objects.requireNonNull(builder.name, "name");
        this.engine = builder.engine;
        this.capacity = Objects.requireNonNull(builder.capacity);
        this.location = builder.location;
        this.tonnage = Objects.requireNonNull(builder.tonnage, "tonnage");
        this.fuel = builder.fuel;
        this.maximumDistance = Objects.requireNonNull(builder.maximumDistance);
        this.work = builder.work;
    }

    public void getOnBoard(int num_people) {
        int temp = this.numPeople + num_people;

        if (temp > this.capacity) {
            System.out.printf(num_people - temp + capacity
                    + " out of " + num_people +
                    " got on the board. The \s is FULL.\n", this.name);
            this.numPeople = capacity;
        } else
            System.out.println("People got ON board: "
                    + this.numPeople + " -> " + temp);
        this.numPeople = temp;

    }

    public void getOffBoard(int num_people) {
        int temp = this.numPeople - num_people;
        if (temp < 0) {
            System.out.println(this.numPeople +
                    " people got OFF the " + this.name + ". The " + this.name + " is empty.");
            this.numPeople = 0;
        } else {
            System.out.println("People got OFF board: " + this.numPeople + " -> " + temp + ".");
            this.numPeople = temp;
        }

    }

    @Override
    public void info() {
        super.info();
        System.out.println("People in board: " + this.numPeople + " Capacity: " + this.capacity);
    }

    public static class Builder {
        private final Integer fuel       = 90;
        private final boolean sailedAway = false;
        private       String  name, location, engine_name;
        private Integer fuel_consumption;
        private Integer force_power;
        private Integer capacity;
        private Integer tonnage;
        private Integer maximumDistance;
        private Engine  engine;
        private Workday work;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder tonnage(Integer tonnage) {
            this.tonnage = tonnage;
            return this;
        }

        public Builder fuelConsumption(Integer consumption_Hour) {
            this.fuel_consumption = consumption_Hour;
            return this;
        }

        public Builder maximumDistance(Integer maximumDistance) {
            this.maximumDistance = maximumDistance;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder numPeople(Integer numPeople) {
            int numPeople1 = numPeople;
            return this;
        }

        public Builder engine_name(String engine_name) {
            this.engine_name = engine_name;
            return this;
        }

        public Builder force_power(Integer force_power) {
            this.force_power = force_power;
            return this;
        }

        public Public_transport build() {
            Engine engine = new Engine.Builder()
                    .name(this.engine_name)
                    .force_power(this.force_power)
                    .build();

            if (Objects.nonNull(this.tonnage))
                this.capacity = this.tonnage / 100;

            Workday work = new Workday.Builder()
                    .fuel(this.fuel)
                    .fuelConsumption(this.fuel_consumption)
                    .build();

            this.work = work;

            return new Public_transport(this);
        }
    }
}


