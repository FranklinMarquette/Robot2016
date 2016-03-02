package org.usfirst.frc.team4623.robot;

import org.usfirst.frc.team4623.robot.commands.Feed;
import org.usfirst.frc.team4623.robot.commands.Launch;
import org.usfirst.frc.team4623.robot.commands.armBackwards;
import org.usfirst.frc.team4623.robot.commands.armDown;
import org.usfirst.frc.team4623.robot.commands.armForward;
import org.usfirst.frc.team4623.robot.commands.armLiftStop;
import org.usfirst.frc.team4623.robot.commands.armStop;
import org.usfirst.frc.team4623.robot.commands.armUp;
import org.usfirst.frc.team4623.robot.commands.botDown;
import org.usfirst.frc.team4623.robot.commands.botStop;
import org.usfirst.frc.team4623.robot.commands.botUp;
import org.usfirst.frc.team4623.robot.commands.liftExtend;
import org.usfirst.frc.team4623.robot.commands.liftRetract;
import org.usfirst.frc.team4623.robot.commands.shoot;
import org.usfirst.frc.team4623.robot.commands.stopFeed;
import org.usfirst.frc.team4623.robot.subsystems.XBox;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
	public XBox driver = new XBox(0);
	public XBox buttons = new XBox(1);
	
	public OI() {
		
      JoystickButton shoot = new JoystickButton(driver, XBox.LB_BUTTON);
      JoystickButton botLiftUp = new JoystickButton(driver, XBox.Y_BUTTON);
      JoystickButton botLiftDown = new JoystickButton(driver, XBox.A_BUTTON);
      JoystickButton launch = new JoystickButton(driver, XBox.RB_BUTTON);
      JoystickButton liftExt = new JoystickButton(driver, XBox.X_BUTTON);
      JoystickButton liftRet = new JoystickButton(driver, XBox.B_BUTTON);
	  
      JoystickButton feed = new JoystickButton(buttons, XBox.X_BUTTON);
	  JoystickButton armLiftUp = new JoystickButton(buttons, XBox.Y_BUTTON);
	  JoystickButton armLiftDown = new JoystickButton(buttons, XBox.A_BUTTON);
	  JoystickButton armForward = new JoystickButton(buttons, XBox.LB_BUTTON);
	  JoystickButton armBackwards = new JoystickButton(buttons, XBox.RB_BUTTON);
	  
	  
	  shoot.whenPressed(new shoot());
	  
	  botLiftUp.whenPressed(new botUp());
	  botLiftUp.whenReleased(new botStop());
	  botLiftDown.whenPressed(new botDown());
	  botLiftDown.whenReleased(new botStop());
	  
	  launch.whenPressed(new Launch());
	  
	  liftExt.whenPressed(new liftExtend());
	  liftRet.whenPressed(new liftRetract());
	  
	  feed.whenPressed(new Feed());
	  feed.whenReleased(new stopFeed());
	  
	  armLiftUp.whenPressed(new armUp());
	  armLiftUp.whenReleased(new armLiftStop());
	  armLiftDown.whenPressed(new armDown());
	  armLiftDown.whenReleased(new armLiftStop());
	  
	  armForward.whenPressed(new armForward());
	  armForward.whenReleased(new armStop());
	  armBackwards.whileHeld(new armBackwards());
	  armBackwards.whenReleased(new armStop());
	
	}
	
}

