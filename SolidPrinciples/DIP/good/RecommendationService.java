package SolidPrinciples.DIP.good;

/*
 * GOOD DESIGN:
 * Service depends on abstraction,
 * not concrete implementation.
 */
public class RecommendationService {

    private RecommendationStrategy strategy;

    /*
     * Dependency injected through constructor.
     */
    public RecommendationService(
            RecommendationStrategy strategy) {

        this.strategy = strategy;
    }

    public void recommendMovies() {

        strategy.recommend();
    }
}
