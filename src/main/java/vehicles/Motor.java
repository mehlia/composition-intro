package vehicles;


public class Motor implements IMotorised{

    private int fuel;
    private int hp;

    public Motor(int fuel, int hp){
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void startEngine(){
        System.out.println("Motor started");
    }

    public void stopEngine(){
        System.out.println("Motor stopped");
    }
}
