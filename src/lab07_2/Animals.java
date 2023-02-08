package lab07_2;

import java.security.SecureRandom;

public class Animals {
     private  String name;
     private int speed;
    public Animals(int maxSpeed) {
        this.speed= new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
