package SolidPrinciples.DIP.bad;

public class Main {

    public static void main(String[] args) {

        RecommendationService service
                = new RecommendationService();

        service.recommendMovies();
    }
}
