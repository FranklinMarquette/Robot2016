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
	
     SpeedController feedMotor;
    
    public Feed() {
    	
    	feedMotor = new Victor(9);
    	
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run(double speed) {
    	
    	feedMotor.set(speed);
    	
    }
    
    public void stop() {
    	
    	feedMotor.set(0);
    	
    }
    
}
