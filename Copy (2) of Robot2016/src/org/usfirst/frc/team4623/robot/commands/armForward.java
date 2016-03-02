package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class armForward extends Command {

    public armForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.arm.armForward();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.arm.armStop();
    }

    protected void interrupted() {
        end();
    }
}
