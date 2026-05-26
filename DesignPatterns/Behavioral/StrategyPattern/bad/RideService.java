package DesignPatterns.Behavioral.StrategyPattern.bad;

/*
 * BAD DESIGN:
 * All ride matching algorithms
 * inside one service class.
 */
public class RideService {

    public void matchRide(String type) {

        if(type.equals("NEAREST")) {

            System.out.println(
                    "Matching nearest driver"
            );
        }

        else if(type.equals("RATING")) {

            System.out.println(
                    "Matching highest rated driver"
            );
        }

        else if(type.equals("CHEAPEST")) {

            System.out.println(
                    "Matching cheapest ride"
            );
        }
    }
}
