package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class lift2Down extends Command {

    public lift2Down() {
    	requires(Robot.lift2);
    }

    protected void initialize() {
        Robot.lift2.initializeCounter2();
        Robot.lift2.lift2Down();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.lift2.isSwitch2Set();
    }

    protected void end() {
        Robot.lift2.lift2Stop();
    }

    protected void interrupted() {
        end();
    }
}
