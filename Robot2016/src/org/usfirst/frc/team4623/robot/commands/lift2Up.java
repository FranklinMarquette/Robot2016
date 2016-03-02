package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class lift2Up extends Command {

    public lift2Up() {
    	requires(Robot.lift2);
    }

    protected void initialize() {
        Robot.lift2.liftUp();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.lift2.liftStop();
    }

    protected void interrupted() {
        end();
    }
}
