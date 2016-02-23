package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
public class Lift extends Subsystem {

    SpeedController liftMotor = new Victor(7);
    DigitalInput limitSwitch1, limitSwitch2;
    Counter counter1, counter2;
    
    public Lift() {
    	
      limitSwitch1 = new DigitalInput(0);
      limitSwitch2 = new DigitalInput(1);
    	
    }

    public void liftUp() {
    	liftMotor.set(1);
    	/*while(limitSwitch1.get() == true && limitSwitch2.get() == false) {
    }*/
    }

    public void liftDown() {
        liftMotor.set(-1);
    	/*while(limitSwitch2.get() == true && limitSwitch1.get() == false) {
    }*/
    }

    public void liftStop() {
        liftMotor.set(0);
    }
    protected void initDefaultCommand() {
    }
}