package SensorsAndTemp;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSensor implements Sensor{

    boolean isOn;
    List<Sensor> sensors;
    List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        isOn = false;
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn() {
        for (Sensor sensor : sensors){
            sensor.setOn();
        }
        this.isOn = true;
    }

    public void setOff() {
        for (Sensor sensor : sensors){
            sensor.setOff();
        }
        this.isOn = false;
    }

    public int read() throws IllegalStateException {
        if(isOn() && !sensors.isEmpty()){
            OptionalDouble avg = sensors.stream().mapToDouble(Sensor::read).average();
            if (avg.isPresent()) {
                readings.add((int) avg.getAsDouble());
                return (int) avg.getAsDouble();
            } else return 0;
        } else {
            throw new IllegalStateException("Invalid list of sensors.");
        }
    }
}
