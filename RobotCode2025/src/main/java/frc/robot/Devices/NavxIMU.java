package frc.robot.Devices;

import frc.robot.Interfaces.Devices;
import frc.robot.Interfaces.Gyro;

public class NavxIMU implements Devices, Gyro {

     public boolean isEnabled() {
        return this.isEnabled();
    }

    @Override
    public double getyaw() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override 
    public double getRate() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override 
    public double getCompassHeading() {
        // TODO Auto-generated method stub  
        return 0;
    }
    @Override 
    public double getRawAccelZ() {
        // TODO Auto-generated method stub
        return 0;
    }
}
