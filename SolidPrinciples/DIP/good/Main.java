package SolidPrinciples.DIP.good;

public class Main {

    public static void main(String[] args) {

        RecommendationStrategy strategy
                = new TrendingRecommendation();

        RecommendationService service
                = new RecommendationService(strategy);

        service.recommendMovies();
    }
}
