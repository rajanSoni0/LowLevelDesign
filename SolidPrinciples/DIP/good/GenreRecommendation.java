package SolidPrinciples.DIP.good;

/*
 * Genre-based recommendation strategy.
 */
public class GenreRecommendation
        implements RecommendationStrategy {

    @Override
    public void recommend() {

        System.out.println(
                "Showing genre-based movies"
        );
    }
}
