package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class lift2Down extends Command {

    public lift2Down() {
    	requires(Robot.lift2);
    }

    protected void initialize() {
        Robot.lift2.liftDown();
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
