package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class liftDown extends Command {

    public liftDown() {
    	requires(Robot.lift);
    }

    protected void initialize() {
    }

    protected void execute() {
    	 Robot.lift.liftDown();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.lift.liftStop();
    }

    protected void interrupted() {
        end();
    }
}
