package lab_08;

public class Animals {
    private String name;
    private int speed;
    private boolean flyable;
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(int maxSpeed) {
        this.speed = maxSpeed;
    }
    public boolean isFlyable() {
        return flyable;
    }
    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }
    protected Animals(Builder builder){
        this.name=builder.name;
        this.flyable=builder.flyable;
        this.speed=builder.speed;
    }
    public static class Builder{
        private String name;
        private boolean flyable;
        private int speed;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setFlyable(boolean flyable){
            this.flyable=flyable;
            return this;
        }
        public Builder setSpeed(int speed){
            this.speed=speed;
            return this;
        }
        public Animals build() {
            return new Animals(this);
        }
    }
}
