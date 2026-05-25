package SolidPrinciples.ISP.good;

/*
 * Main class to test ISP.
 */
public class Main {

    public static void main(String[] args) {

        HumanWorker human = new HumanWorker();

        RobotWorker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();
    }
}
