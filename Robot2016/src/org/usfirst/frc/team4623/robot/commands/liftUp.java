package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class liftUp extends Command {

    public liftUp() {
    	requires(Robot.lift);
    }

    protected void initialize() {
        Robot.lift.initializeCounter1();
        Robot.lift.liftUp();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.lift.isSwitch1Set();
    }

    protected void end() {
        Robot.lift.liftStop();
    }

    protected void interrupted() {
        end();
    }
}