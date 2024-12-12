package frc.robot.Interfaces;

import edu.wpi.first.units.Distance;
import edu.wpi.first.units.Measure;

public interface accelerometer {
    public void resetDisplacement();
    public float getDisplacementX();
    public float getDisplacementY();
    public float getDisplacementZ();
    public double getVelocityX();
    public double getVelocityY();
    public double getVelocityZ();
    public double getRawAccelX();
    public double getRawAccelY();
    public double getRawAccelZ();

}
