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

    @Override
    public void resetDisplacement() {
        // TODO Auto-generated method stub
        public void resetDisplacement() {};
    }

    @Override
    public float getDisplacementX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDisplacementX'");
    }

    @Override
    public float getDisplacementY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDisplacementY'");
    }

    @Override
    public float getDisplacementZ() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDisplacementZ'");
    }

    @Override
    public double getVelocityX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVelocityX'");
    }

    @Override
    public double getVelocityY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVelocityY'");
    }

    @Override
    public double getVelocityZ() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVelocityZ'");
    }
}
