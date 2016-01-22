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
	
	public Pnuematics() {
		
		comp.setClosedLoopControl(true);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void retract(int port1, int port2) {
    	
    	DoubleSolenoid solenoid = new DoubleSolenoid(port1, port2);
    	
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public void extend(int port1, int port2) {
    	
    	DoubleSolenoid solenoid = new DoubleSolenoid(port1, port2);
    	
    	solenoid.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public void stop(int port1, int port2) {
    	
    	DoubleSolenoid solenoid = new DoubleSolenoid(port1, port2);
    	
    	solenoid.set(DoubleSolenoid.Value.kOff);
    	
    }
}

