package Task2;

import Interfaces.MovingObject;

public class Wall extends AWall implements Barrier  {

    private double height;

    public double getHeight() {
        return height;
    }

    public Wall(double height)
    {
        this.height = height;
    }

}
