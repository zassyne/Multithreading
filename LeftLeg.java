/**
 * Created by yassine on 18.05.17.
 */
public class LeftLeg implements Runnable {

    Robot robot;



    public LeftLeg(Robot robot) {
        this.robot = robot;
        new Thread(this).start();
    }




    @Override
    public void run() {

        while(true) {
            robot.moveLeftLeg();
        }

    }
}

