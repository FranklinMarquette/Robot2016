package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class lift2Up extends Command {

    public lift2Up() {
    	requires(Robot.lift2);
    }

    protected void initialize() {
        Robot.lift2.initializeCounter1();
        Robot.lift2.lift2Up();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.lift2.isSwitch1Set();
    }

    protected void end() {
        Robot.lift2.lift2Stop();
    }

    protected void interrupted() {
        end();
    }
}
