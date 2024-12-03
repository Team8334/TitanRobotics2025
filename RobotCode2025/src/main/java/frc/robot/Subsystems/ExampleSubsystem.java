package frc.robot.Subsystems; 
// Demonstrates how to use the new Subsystem Interface.
public class ExampleSubsystem implements Subsystem{ 
    private static ExampleSubsystem instance = null;

    public static ExampleSubsystem getInstance(){
        if(instance==null)
        {
            instance = new ExampleSubsystem();
        }
            return instance;
    }
 
    public ExampleSubsystem(){

    }

    public void update(){

    }

    public void initialize(){

    }

    public boolean isActive(){
        return true;
    }

    public String getName(){
        return "example";
    }
}
