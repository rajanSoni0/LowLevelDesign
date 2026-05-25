package SolidPrinciples.DIP.good;

/*
 * Recently watched recommendation strategy.
 */
public class RecentRecommendation
        implements RecommendationStrategy {

    @Override
    public void recommend() {

        System.out.println(
                "Showing recent recommendations"
        );
    }
}
