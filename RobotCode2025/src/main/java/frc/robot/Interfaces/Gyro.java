package frc.robot.Interfaces;

public interface Gyro {
    public double yaw;
    public double getyaw();
    public double getRate();
    public double getCompassHeading();
    public double getRawAccelZ();//gets acceleration

}

