public class API {
    public static void main(String[] argz){

    // Test Engine class
        Engine LexusRT20 = new Engine.Builder()
                .name("LexusRT20")
                .force_power(600)
                .started(false)
                .build();

        LexusRT20.start();
        LexusRT20.info();
        LexusRT20.stop();


//            CruiseShip Victoria = CruiseShip.builder()
//                    .numPeople(0)
//                    .sailedAway(false)
//                    .location("San-francisco")
//                    .tonnage(12000)
//                    .build();
//
//            Victoria.info();


//                Machine tank = new Machine().builder()
//                        .fuel(50)
//                        .name("Panther 3")
//                        .engine(RV)
//                        .build();

        }


}


