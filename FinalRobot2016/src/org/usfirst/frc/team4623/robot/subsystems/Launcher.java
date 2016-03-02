package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Launcher extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	DoubleSolenoid ds1;
	Compressor comp;
	
	public Launcher() {
		
		ds1 = new DoubleSolenoid(0, 1);
		comp = new Compressor(0);
		comp.setClosedLoopControl(true);
		
	}
	
	public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	        //setDefaultCommand(new MySpecialCommand());
	}

	public boolean toggle;
			
		    public void solenoidIn() {
		    	   ds1.set(DoubleSolenoid.Value.kReverse);
			toggle = true;
		    }
		       
		    public void solenoidOut(){
		    	   ds1.set(DoubleSolenoid.Value.kForward);
		toggle = false;
		       }

}

