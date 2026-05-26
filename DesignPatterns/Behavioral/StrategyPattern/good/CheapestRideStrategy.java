package DesignPatterns.Behavioral.StrategyPattern.good;

/*
 * Matches cheapest available ride.
 */
public class CheapestRideStrategy
        implements RideMatchingStrategy {

    @Override
    public void matchRide() {

        System.out.println(
                "Matching cheapest ride"
        );
    }
}
