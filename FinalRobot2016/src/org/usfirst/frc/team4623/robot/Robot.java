
package org.usfirst.frc.team4623.robot;

import org.usfirst.frc.team4623.robot.commands.autonomous1;
import org.usfirst.frc.team4623.robot.subsystems.Arm;
import org.usfirst.frc.team4623.robot.subsystems.Chassis;
import org.usfirst.frc.team4623.robot.subsystems.Feed;
import org.usfirst.frc.team4623.robot.subsystems.armLift;
import org.usfirst.frc.team4623.robot.subsystems.botLift;
import org.usfirst.frc.team4623.robot.subsystems.Pnuematics;
import org.usfirst.frc.team4623.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    
    Command autonomousCommand;
    SendableChooser chooser;
    
    public static Shooter shooter;
    public static Feed feed;
    public static armLift armLift;
    public static Chassis chassis;
    public static Arm arm;
    public static botLift botLift;
    public static Pnuematics pnue;
    public static OI oi;
    
    CameraServer server;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
       
        shooter = new Shooter();
        feed = new Feed();
        armLift = new armLift();
        chassis = new Chassis();
        arm = new Arm();
        botLift = new botLift();
        pnue = new Pnuematics();
        oi = new OI();
        
        server = CameraServer.getInstance();
        server.setQuality(50);
        server.startAutomaticCapture("cam1");
        
        chooser = new SendableChooser();
        chooser.addDefault("Default Program", new autonomous1());
        SmartDashboard.putData("Auto mode", chooser);
        
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        autonomousCommand = (Command) chooser.getSelected();
        autonomousCommand.start();
        
		/*String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "Auto1":
			autonomousCommand = new autonomous1();
			break;
		} 
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    }
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
