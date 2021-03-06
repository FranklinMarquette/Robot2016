package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class liftUp extends Command {

    public liftUp() {
    	requires(Robot.lift);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lift.liftUp();
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