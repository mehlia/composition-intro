package vehicles;

// Different rotor tyles:
// semirigid, rigid, or fully articulated.

import products.IProduct;

public class Helicopter extends Vehicle implements IAirVehicle{

    private String radarType;
    private String rotorType;
    private int thrust;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, String radarType, String rotorType, int thrust) {
        super(weight, maxSpeed, baseProduct);
        this.radarType = radarType;
        this.rotorType = rotorType;
        this.thrust = thrust;
    }

    @Override
    public String getRadarType() {
        return radarType;
    }

    @Override
    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    @Override
    public String getRotorType() {
        return rotorType;
    }

    @Override
    public void setRotorType(String rotorType) {
        this.rotorType = rotorType;
    }

    @Override
    public int getThrust() {
        return thrust;
    }

    @Override
    public void setThrust(int thrust) {
        this.thrust = thrust;
    }
}
