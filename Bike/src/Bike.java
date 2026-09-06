public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;

    public Bike() {
        isOn = false;
        speed = 0;
        gear = 1;
    }

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {

        return speed;
    }

    public int getGear() {

        return gear;
    }

    public void accelerate() {
        if(isOn) {
            if(gear == 1){
                speed += 1;
            }
            else if(gear == 2){
                speed += 2;
            }
            else if (gear == 3){
                speed += 3;
            }
            else if (gear == 4) {
                speed += 4;
            }
            changeGear();
        }

    }

    public void decelerate() {

        if (isOn) {

            if (gear == 1) {
                speed -= 1;
            } else if (gear == 2) {
                speed -= 2;
            } else if (gear == 3) {
                speed -= 3;
            } else if (gear == 4) {
                speed -= 4;
            }

            if (speed < 0) {
                speed = 0;
            }

            changeGear();
        }
    }


    private void changeGear() {
        if(speed <= 20){
            gear = 1;
        }
        else if (speed <= 30) {
            gear = 2;
        }
        else if (speed <= 40){
            gear = 3;
        }
        else {
            gear = 4;
        }
    }
}
