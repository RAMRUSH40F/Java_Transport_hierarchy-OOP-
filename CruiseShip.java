import lombok.Builder;

@Builder
public class CruiseShip extends Water_transport
{
    private int capacity = this.tonnage / 100;
    private int numPeople;

    private Integer tonnage, maximumDistance;
    private String location;
    private boolean sailedAway;




    public void getOnBoard(int num_people)
    {
        int temp = this.numPeople + num_people;
        if(temp>this.capacity) {
            System.out.println(Integer.toString(num_people - temp + capacity)
                    + " out of " + num_people +
                    " got on the board. The ship is full.");
            this.numPeople = capacity;
        }
        else
            this.numPeople = temp;

    }

    public void getOffBoard(int num_people){
        int temp = this.numPeople - num_people;
        if(temp<0) {
            System.out.println(Integer.toString(this.numPeople) +" got off the " +this.name + " The ship is empty.");
            this.numPeople = 0;
        }
        else{
            System.out.println(Integer.toString(num_people) +" got off the " +this.name+".");
            this.numPeople = temp;
        }

    }
}
