package frc.robot.Subsystems;
// Demonstrates how to use the new Subsystem Interface.
public class ExampleSubsystem implements Subsystem{ 
    private static ExampleSubsystem instance = null;

    private int exampleVariable;
    private double exampleVariable2;
    private boolean running;

    public static ExampleSubsystem getInstance(){ //Returns the current instance of the class.
        if(instance==null)
        {
            instance = new ExampleSubsystem();
        }
            return instance;
    }
 
    public ExampleSubsystem(){ //Constructor

    }

    public double getExampleVariable2(){ //Filler Function
        return exampleVariable2;
    }

    public void exampleVariableState(){ //Filler Function
        switch(exampleVariable){
            case 1:
                System.out.println("ExampleVariable is 1");
            break;
            case 2:
                System.out.println("ExampleVariable is 2");
            break;
            case 3:
                System.out.println("ExampleVariable is 3");
            break;
            default:
                System.out.println("ExampleVariable is less than 1 or greater than 3");
        }
    }

    public boolean isActive(){ //Returns if the subsystem is actively running. 
        if(running){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName(){ //Returns the name of the subsystem.
        return "ExampleSubsystem";
    }

    public void initialize(){ //Initializes the variables of a class, like motors for example. Place the definitions of your variables here.
        exampleVariable = 4;
        exampleVariable2 = 3.5;
        running = false;
    }

    public void update(){ //Used to update specific functions that need to be ran continuously. For example, running a camera.
        
    }
    
}
