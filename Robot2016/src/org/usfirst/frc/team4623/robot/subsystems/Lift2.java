package org.usfirst.frc.team4623.robot.subsystems;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift2 extends Subsystem {

    Victor liftMotor = new Victor(7);
    
    public Lift2() {
    }
    
    /**
     * @return Number of times the top limit switch has been hit.
     *
    
    /**
     * @return Number of times the bottom limit switch has been hit.
     */


    public void liftUp() {
    	double power = 1;
        // stop motor if attempt is made to go past the top
    	liftMotor.set(power);
    }

    public void liftDown() {
    	double power = -1;
        // stop motor if attempt made to go past bottom
        liftMotor.set(power);
    }

    public void liftStop() {
        liftMotor.set(0);
    }
    protected void initDefaultCommand() {
    }
}
