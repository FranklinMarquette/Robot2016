package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveTele extends Command {
	
    public driveTele() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.chassis.setSpeed(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.chassis.driveTele(Robot.oi.driver.getLeftJoyX(), Robot.oi.driver.getLeftJoyY());
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.driveTele(0,  0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
