package SolidPrinciples.DIP.bad;

/*
 * BAD DESIGN:
 * High-level service directly depends
 * on low-level concrete classes.
 */
public class RecommendationService {

    private TrendingRecommendation trendingRecommendation
            = new TrendingRecommendation();

    public void recommendMovies() {

        trendingRecommendation.recommend();
    }
}
