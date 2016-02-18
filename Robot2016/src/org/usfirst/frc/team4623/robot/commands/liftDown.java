package org.usfirst.frc.team4623.robot.commands;
import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class liftDown extends Command {

    public liftDown() {
    	requires(Robot.lift);
    }

    protected void initialize() {
        Robot.lift.initializeCounter2();
        Robot.lift.liftDown();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.lift.isSwitch2Set();
    }

    protected void end() {
        Robot.lift.liftStop();
    }

    protected void interrupted() {
        end();
    }
}
