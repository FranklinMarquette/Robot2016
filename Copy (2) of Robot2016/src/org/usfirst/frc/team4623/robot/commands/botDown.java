package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class botDown extends Command {

    // Used to detect the case of going past the limit switch
    private int limitCnt;

    public botDown() {
    	requires(Robot.botLift);
    }

    protected void initialize() {
    	limitCnt = Robot.botLift.getBotCount();
    }

    protected void execute() {
    	if (limitCnt == Robot.botLift.getBotCount()) {
                // Have not gone past limit switch, OK to try and move up
                // (lift subsystem will stop us if we are on the limit switch)
    		Robot.botLift.liftDown();
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