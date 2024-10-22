package frc.robot.Subsystems;

import java.util.ArrayList;
import java.util.List;

public class SubsystemManager {

    private static List<Subsystem> subsystems = new ArrayList<>();

    /**Use to register a subsystem to the list of subsystems in the constructor of that subsystem. 
    *@param newSubsystem the subsystem to register 
    */
    public static void registerSubsystem(Subsystem newSubsystem)
    {
        subsystems.add(newSubsystem); 
    }
    /**Use to initialize all subsystems. Call if the code is being executed(likely in Control.java).
     */
    public static void initializeSubsystems(){
        for(Subsystem subsystem : subsystems){
            subsystem.initialize();
        }
    }
    /**Use to acquire the full list of subsystems.
     * @return the list of all registered subsystems
     */
    public static List<Subsystem> getSubsystems()
    {
        return subsystems;
    }

    public static void updateAllSubsystems(){
        for(Subsystem subsystem : subsystems){
            subsystem.update();
        }
    }

    
}
