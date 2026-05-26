package DesignPatterns.Behavioral.StrategyPattern.good;

/*
 * Matches nearest available driver.
 */
public class NearestDriverStrategy
        implements RideMatchingStrategy {

    @Override
    public void matchRide() {

        System.out.println(
                "Matching nearest driver"
        );
    }
}
