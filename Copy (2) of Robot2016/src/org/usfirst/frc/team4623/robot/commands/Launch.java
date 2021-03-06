package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Launch extends Command {

    public Launch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.pnue);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (Robot.pnue.toggle1 == true)
    	{
    	Robot.pnue.solenoid1Out();
    	}
    	else if(Robot.pnue.toggle1 == false){
    	Robot.pnue.solenoid1In();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
