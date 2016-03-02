package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class botUp extends Command {

    // Used to detect the case of going past the limit switch
    private int limitCnt;

    public botUp() {
    	requires(Robot.botLift);
    }

    protected void initialize() {
    	limitCnt = Robot.botLift.getTopCount();
    }

    protected void execute() {
    	if (limitCnt == Robot.botLift.getTopCount()) {
                // Have not gone past limit switch, OK to try and move up
                // (lift subsystem will stop us if we are on the limit switch)
    		Robot.botLift.liftUp();
    	} else {
    		// Somehow we got past the top limit switch, stop motors!
    		Robot.botLift.liftStop();
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.botLift.liftStop();
    }

    protected void interrupted() {
        end();
    }
}
