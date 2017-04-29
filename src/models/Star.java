package models;

/**
 * Created by lzx on 2017/3/27.
 * this is a model class for star, every star must be constructed as here
 */
public class Star {

    public int mass;
    public double r;

    public double x;
    public double y;

    public double speedX;
    public double speedY;

    public double accelerationX;
    public double accelerationY;

    public boolean onScreen;

    public Star() {
        initialize();
    }

    public void initialize() {
        mass = 1;
        r = 5;
        speedX = speedY = 0;
        accelerationX = 0;
        accelerationY = 0;
        onScreen = false;
        x = 400;
        y = 280;
    }

    private void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void show(double xin, double yin) {
        initialize();
        onScreen = true;
        setPosition(xin, yin);
    }

    public void move() {
        speedX = speedX + accelerationX;
        speedY = speedY + accelerationY;
        x = x + speedX;
        y = y + speedY;
    }

    public void remove() {
        setPosition(400, 280);
        initialize();
    }

}
