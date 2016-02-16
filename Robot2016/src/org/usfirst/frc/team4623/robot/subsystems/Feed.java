package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feed extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    private SpeedController feed;
    
    public Feed() {
    	
    	feed = new Victor(5);
    	
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run(double speed) {
    	
    	feed.set(speed);
    	
    }
    
    public void stop() {
    	
    	feed.set(0);
    	
    }
    
}
