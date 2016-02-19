package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
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
    DigitalInput limitSwitch1, limitSwitch2;
    Counter counter1, counter2;
	
	public Arm() {
		
		armMotor = new Victor(8);
		limitSwitch1 = new DigitalInput(0);
		limitSwitch2 = new DigitalInput(1);
		counter1 = new Counter(limitSwitch1);
		counter2 = new Counter(limitSwitch2);
		
	}
	
	 public boolean isSwitch1Set() {
	        return counter1.get() > 0;
	 }
	    
	 public boolean isSwitch2Set() {
	    	return counter2.get() > 0;
	 }

	 public void initializeCounter1() {
	        counter1.reset();
    }
	    
     public void initializeCounter2() {
	    	counter2.reset();
    }
    
    public void armForward() {
    	
    	armMotor.set(1);
    	
    }
    
    public void armBackwards() {
    	
    	armMotor.set(-1);
    	
    }
    
    public void armStop() {
    	
    	armMotor.set(0);
    	
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
}

