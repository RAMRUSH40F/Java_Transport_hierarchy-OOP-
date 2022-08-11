import lombok.Builder;


public class API {
    public static void main(String[] argz){
            CruiseShip Victoria = CruiseShip.builder()
                    .numPeople(0)
                    .sailedAway(false)
                    .location("San-francisco")
                    .tonnage(12000)
                    .build();

            Victoria.info();


        }
    }

