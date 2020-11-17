package Interfaces;

import Task2.Treadmill;
import Task2.Wall;

public interface MovingObject {

    public void jump();

    public void jump(Wall wall);

    public void run();

    public void run(Treadmill treadmill);

    boolean isHasObjectDoneThat();
}
