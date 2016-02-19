package org.usfirst.frc.team4623.robot;

import org.usfirst.frc.team4623.robot.commands.Feed;
import org.usfirst.frc.team4623.robot.commands.armBackwards;
import org.usfirst.frc.team4623.robot.commands.armForward;
import org.usfirst.frc.team4623.robot.commands.liftDown;
import org.usfirst.frc.team4623.robot.commands.liftUp;
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
	  
      JoystickButton feed = new JoystickButton(buttons, XBox.RB_BUTTON);
	  JoystickButton liftUp = new JoystickButton(buttons, XBox.B_BUTTON);
	  JoystickButton liftDown = new JoystickButton(buttons, XBox.A_BUTTON);
	  JoystickButton armForward = new JoystickButton(buttons, XBox.LB_BUTTON);
	  JoystickButton armBackwards = new JoystickButton(buttons, XBox.RB_BUTTON);
	  
	  
	  shoot.whenPressed(new shoot());
	  
	  feed.whenPressed(new Feed());
	  feed.whenReleased(new stopFeed());
	  
	  liftUp.whileHeld(new liftUp());
	  liftDown.whileHeld(new liftDown());
	  
	  armForward.whileHeld(new armForward());
	  armBackwards.whileHeld(new armBackwards());
	  
      
		
	}
	
}

