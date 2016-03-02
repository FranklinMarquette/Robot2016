package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class armDown extends Command {

    // Used to detect the case of going past the limit switch
    private int limitCnt;

    public armDown() {
    	requires(Robot.armLift);
    }

    protected void initialize() {
    	limitCnt = Robot.armLift.getBotCount();
    }

    protected void execute() {
    	if (limitCnt == Robot.armLift.getBotCount()) {
                // Have not gone past limit switch, OK to try and move up
                // (lift subsystem will stop us if we are on the limit switch)
    		Robot.armLift.liftDown();
    	} else {
    		// Somehow we got past the top limit switch, stop motors!
    		Robot.armLift.liftStop();
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.armLift.liftStop();
    }

    protected void interrupted() {
        end();
    }
}
