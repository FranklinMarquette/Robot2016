package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnuematics extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor comp = new Compressor(0);

       DoubleSolenoid ds1 = new DoubleSolenoid(0, 1);
	
	public Pnuematics() {
		
		comp.setClosedLoopControl(true);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void retract1() {
    	
       ds1.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public void extend1() {
    	
    	ds1.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public void stop1() {
    	
    	ds1.set(DoubleSolenoid.Value.kOff);
    	
    }

}

