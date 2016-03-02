package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    SpeedController armMotor;
	
	public Arm() {
		
		armMotor = new Victor(8);
		
	}
    
    public void armForward() {
    	armMotor.set(-.45);	
    }
    
    public void armBackwards() {
    	armMotor.set(.45);
    }
    
    public void armStop() {
    	
    	armMotor.set(0);
    	
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
}

