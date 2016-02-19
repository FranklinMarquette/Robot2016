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
	
	DoubleSolenoid ds1, ds2;
	Compressor comp;
	
	public Pnuematics() {
		
		ds1 = new DoubleSolenoid(0, 1);
		ds2 = new DoubleSolenoid(2, 3);
		comp = new Compressor(0);
		comp.setClosedLoopControl(true);
		
	}
	
	public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	        //setDefaultCommand(new MySpecialCommand());
	}

	public boolean toggle1;
	public boolean toggle2;
			
		    public void solenoid1In() {
		    	   ds1.set(DoubleSolenoid.Value.kReverse);
			toggle1 = true;
		    }
		       
		    public void solenoid1Out(){
		    	   ds1.set(DoubleSolenoid.Value.kForward);
		    toggle1 = false;
		       }
		    
		    public void solenoid2In() {
		    	   ds2.set(DoubleSolenoid.Value.kReverse);
			toggle2 = true;
		    }
		       
		    public void solenoid2Out(){
		    	   ds2.set(DoubleSolenoid.Value.kForward);
		    toggle2 = false;
		       }

}