package DesignPatterns.Behavioral.StrategyPattern.good;

/*
 * Context class.
 *
 * Uses strategy dynamically.
 */
public class RideService {

    private RideMatchingStrategy strategy;

    /*
     * Strategy injected through constructor.
     */
    public RideService(
            RideMatchingStrategy strategy) {

        this.strategy = strategy;
    }

    /*
     * Executes selected strategy.
     */
    public void matchRide() {

        strategy.matchRide();
    }
}
