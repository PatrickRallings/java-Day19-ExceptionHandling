package SensorsAndTemp;

public class StandardSensor implements Sensor{

    int num;
    boolean isOn;

    public StandardSensor(int num){
        this.num = num;
        this.isOn = true;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn() {
    }

    public void setOff() {
    }

    public int read() {
        return this.num;
    }
}
