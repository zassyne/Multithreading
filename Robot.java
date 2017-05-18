/**
 * Created by yassine on 18.05.17.
 */
public class Robot {

    boolean leftMoving = false;
    boolean rightMoving = !leftMoving;

    synchronized public void moveLeftLeg() {

        while(leftMoving) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        rightMoving = false;
        leftMoving = true;
        System.out.println("Left");

        notify();
    }

    synchronized public void moveRightLeg() {

        while(rightMoving) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        rightMoving = true;
        leftMoving = false;
        System.out.println("Right");
        notify();
    }



    public static void main(String[] args) {
        Robot robot = new Robot();

        new LeftLeg(robot);
        new RightLeg(robot);

    }
}

