package vehicles;

import products.IProduct;

public class Plane extends Vehicle implements IAirVehicle {

    private String radarType;
    private String rotorType;
    private int thrust;

    private IMotorised engine;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine, String radarType, String rotorType, int thrust) {
        super(weight, maxSpeed, baseProduct);
        this.radarType = radarType;
        this.rotorType = rotorType;
        this.thrust = thrust;
        this.engine = engine;
    }

    public String getRadarType() {
        return radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    public String getRotorType() {
        return rotorType;
    }

    public void setRotorType(String rotorType) {
        this.rotorType = rotorType;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    
    public void startEngine() {
        this.engine.startEngine();
    }

    public void stopEngine() {
        this.engine.stopEngine();
    }


}
