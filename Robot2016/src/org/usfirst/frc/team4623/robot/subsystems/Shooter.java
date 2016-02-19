package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	SpeedController shooter1;
	SpeedController shooter2;
	
	public Shooter() {
		
		shooter1 = new Victor(4);
		shooter2 = new Victor(5);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void forwards() {
    	
    	shooter1.set(1);
    	shooter2.set(1);
    	
    }
    
    public void stop(){
    	
    	shooter1.set(0);
    	shooter2.set(0);
    	
    }
    
}

