package org.usfirst.frc.team4623.robot.subsystems;



import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team4623.robot.commands.driveTele;

/**
 *
 * @author FrankyMonezz
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    private RobotDrive drive;
    private SpeedController leftMotorOne, leftMotorTwo, rightMotorOne, rightMotorTwo;
    
    public Chassis(){
    	leftMotorOne = new Talon(0);
    	leftMotorTwo = new Talon(1);
    	rightMotorOne = new Talon(2);
    	rightMotorTwo = new Talon(3);
    	
        drive = new RobotDrive(leftMotorOne, leftMotorTwo, rightMotorOne, rightMotorTwo);
        //drive.setSafetyEnabled(false);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new driveTele());
    }
    
    public void driveTele(double moveValue, double turnValue) {
    	
    	 drive.arcadeDrive(-moveValue, -turnValue);
    	
    }
    
    public void setSpeed(double speed) {
        drive.setMaxOutput(speed);
    }
     
    public void driveAuton(double moveValue, double turnValue) {
    	
        drive.arcadeDrive(moveValue, turnValue);
        
    }
   
}
