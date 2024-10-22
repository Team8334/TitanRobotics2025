package frc.robot.Subsystems;

public interface Subsystem
{
    public void update();

    public void initialize();

    public boolean isActive();

    public String getName();
}
