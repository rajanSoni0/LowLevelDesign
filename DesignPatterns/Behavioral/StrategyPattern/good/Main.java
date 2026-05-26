package DesignPatterns.Behavioral.StrategyPattern.good;

public class Main {

    public static void main(String[] args) {

        /*
         * Runtime strategy selection.
         */
        RideMatchingStrategy strategy
                = new NearestDriverStrategy();

        RideService service
                = new RideService(strategy);

        service.matchRide();
    }
}
