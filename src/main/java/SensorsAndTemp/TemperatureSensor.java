package SensorsAndTemp;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    int num;
    boolean isOn;

    public TemperatureSensor(){
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn() {
        this.isOn = true;
    }

    public void setOff() {
        this.isOn = false;
    }

    public int read() throws IllegalStateException {
        if (isOn()){
            this.num = (new Random().nextInt(61)-30);
            return this.num;
        } else {
            throw new IllegalStateException("Sensor is not on.");
        }
    }
}
