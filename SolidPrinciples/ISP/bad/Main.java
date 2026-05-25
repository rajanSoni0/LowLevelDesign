package SolidPrinciples.ISP.bad;

/*
 * Main class to test ISP violation.
 */
public class Main {

    public static void main(String[] args) {

        Worker human = new HumanWorker();

        Worker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();

        // Runtime problem
        robot.eat();
    }
}
