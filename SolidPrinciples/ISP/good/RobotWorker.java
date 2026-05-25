package SolidPrinciples.ISP.good;

/*
 * Robot only works.
 */
public class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
