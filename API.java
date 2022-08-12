public class API {
    public static void main(String[] argz){

                    /* TEST Engine CLASS */
        /* Engine LexusRT20 = new Engine.Builder()
                .name("LexusRT20")
                .force_power(600)
                .started(false)
                .build();

        LexusRT20.start();
        LexusRT20.info();
        LexusRT20.stop();
    */

                    /* TEST Machine CLASS */

    /*    Machine tank = new Machine.Builder()
                .fuel(50)
                .name("Panther 3")
                .engine_name("RV-100")
                .force_power(6000)
                .build();

        tank.info();
        tank.fill(50);
        tank.start();
        tank.info();
    */


                /* TEST CruiseShip CLASS */
            CruiseShip Victoria = new CruiseShip.Builder()
                    .numPeople(0)
                    .location("San-francisco")
                    .tonnage(12000)
                    .name("Victoria")
                    .maximumDistance(500)
                    .engine_name("RPV-50")
                    .force_power(600)

                    .build();

            Victoria.info();
            Victoria.fill(150);
            Victoria.getOnBoard(25);
            Victoria.getOffBoard(30);

            Victoria.getOnBoard(50);
            Victoria.sail("New-York");


        }


}


