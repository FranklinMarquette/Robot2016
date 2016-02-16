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
	
	private SpeedController shooter;
	
	public Shooter() {
		
		shooter = new Victor(4);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run(double speed) {
    	
    	shooter.set(speed);
    	
    }
    
    public void stop(){
    	
    	shooter.set(0);
    	
    }
    
}

