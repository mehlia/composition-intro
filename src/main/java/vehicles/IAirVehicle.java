package vehicles;

public interface IAirVehicle {

    String getRadarType();

    void setRadarType(String radarType);

    String getRotorType();

    void setRotorType(String rotorType);

    int getThrust();

    void setThrust(int thrust);
}
