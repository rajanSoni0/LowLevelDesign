package DesignPatterns.Behavioral.StrategyPattern.good;

/*
 * Matches highest rated driver.
 */
public class HighestRatedDriverStrategy
        implements RideMatchingStrategy {

    @Override
    public void matchRide() {

        System.out.println(
                "Matching highest rated driver"
        );
    }
}
