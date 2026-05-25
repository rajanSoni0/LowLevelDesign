package SolidPrinciples.ISP.bad;

/*
 * BAD DESIGN:
 * Robot does not eat,
 * but still forced to implement eat().
 */
public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {

        // Meaningless implementation 😭
        throw new UnsupportedOperationException(
                "Robot does not eat"
        );
    }
}
