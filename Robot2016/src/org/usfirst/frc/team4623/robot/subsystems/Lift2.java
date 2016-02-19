package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
public class Lift2 extends Subsystem {

    SpeedController liftMotor2 = new Victor(6);
    DigitalInput limitSwitch1, limitSwitch2;
    Counter counter1, counter2;
    
    public Lift2() {
    	
      limitSwitch1 = new DigitalInput(4);
      limitSwitch2 = new DigitalInput(5);
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

    public void lift2Up() {
        liftMotor2.set(1);
    }

    public void lift2Down() {
        liftMotor2.set(-1);
    }

    public void lift2Stop() {
        liftMotor2.set(0);
    }
    protected void initDefaultCommand() {
    }
}
