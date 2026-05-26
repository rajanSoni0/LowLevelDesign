package DesignPatterns.Behavioral.StrategyPattern.bad;

public class Main {

    public static void main(String[] args) {

        RideService service
                = new RideService();

        service.matchRide("NEAREST");
    }
}
