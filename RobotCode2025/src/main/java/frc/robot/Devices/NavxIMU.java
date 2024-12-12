package frc.robot.Devices;

import frc.robot.Interfaces.Devices;
import frc.robot.Interfaces.Gyro;
import frc.robot.Interfaces.accelerometer;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;

public class NavxIMU implements Devices, Gyro, accelerometer {

     public boolean isEnabled() {
        return this.isEnabled();
    }

    AHRS ahrs;

    public NavxIMU()
    {
        ahrs = new AHRS(SPI.Port.kMXP);
    }

    @Override
    public double getyaw() {
        ahrs.getYaw();
        return ahrs.getYaw();
    }
    @Override 
    public double getRate() {
        ahrs.getRate();
        return ahrs.getRate();
    }
    @Override 
    public double getCompassHeading() {
        ahrs.getCompassHeading();
        return ahrs.getCompassHeading();
    }
    
        @Override 
    public double getRawAccelX() {
        ahrs.getRawAccelZ(); 
        return ahrs.getRawAccelX(); 
    }

        @Override 
    public double getRawAccelY() {
        ahrs.getRawAccelZ(); 
        return ahrs.getRawAccelY(); 
    }
    @Override 
    public double getRawAccelZ() {
        ahrs.getRawAccelZ(); //z axis
        return ahrs.getRawAccelZ(); //z axis;
    }

    @Override
    public void resetDisplacement() {
        ahrs.resetDisplacement();
    }

    @Override
    public float getDisplacementX() {
        ahrs.getDisplacementX();
        throw new UnsupportedOperationException("Unimplemented method 'getDisplacementX'");
    }

    @Override
    public float getDisplacementY() {
        ahrs.getDisplacementY();
        throw new UnsupportedOperationException("Unimplemented method 'getDisplacementY'");
    }

    @Override
    public float getDisplacementZ() {
        ahrs.getDisplacementZ();
        throw new UnsupportedOperationException("Unimplemented method 'getDisplacementZ'");
    }

    @Override
    public double getVelocityX() {
        ahrs.getVelocityX();
        throw new UnsupportedOperationException("Unimplemented method 'getVelocityX'");
    }

    @Override
    public double getVelocityY() {
        ahrs.getVelocityY();
        throw new UnsupportedOperationException("Unimplemented method 'getVelocityY'");
    }

    @Override
    public double getVelocityZ() {
        ahrs.getVelocityZ();
        throw new UnsupportedOperationException("Unimplemented method 'getVelocityZ'");
    }
}
