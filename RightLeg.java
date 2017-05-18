/**
 * Created by yassine on 18.05.17.
 */
public class RightLeg implements Runnable {

    Robot robot;



    public RightLeg(Robot robot) {
        this.robot = robot;
        new Thread(this).start();
    }




    @Override
    public void run() {

        while(true) {
            robot.moveRightLeg();
        }

    }
}

