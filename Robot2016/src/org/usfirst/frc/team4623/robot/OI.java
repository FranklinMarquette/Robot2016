package org.usfirst.frc.team4623.robot;

import org.usfirst.frc.team4623.robot.commands.Extend;
import org.usfirst.frc.team4623.robot.commands.Retract;
import org.usfirst.frc.team4623.robot.commands.motor1Move;
import org.usfirst.frc.team4623.robot.commands.motor1Stop;
import org.usfirst.frc.team4623.robot.commands.motor2Backwards;
import org.usfirst.frc.team4623.robot.commands.motor2Forwards;
import org.usfirst.frc.team4623.robot.commands.motor2Stop;
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
    
	public XBox stick = new XBox(1);
	
	public OI() {
		
      JoystickButton move = new JoystickButton(stick, XBox.A_BUTTON);
	  JoystickButton moveForward = new JoystickButton(stick, XBox.X_BUTTON);
	  JoystickButton moveBackward = new JoystickButton(stick, XBox.Y_BUTTON);
	  JoystickButton extend = new JoystickButton(stick, XBox.LB_BUTTON);
	  JoystickButton retract = new JoystickButton(stick, XBox.RB_BUTTON);
		
	  extend.whenPressed(new Extend());
	  retract.whenPressed(new Retract());
	  
	  move.whenPressed(new motor1Move());;
	  move.whenReleased(new motor1Stop());
	  
	  moveForward.whenPressed(new motor2Forwards());
	  moveForward.whenReleased(new motor2Stop());
	  
	  moveBackward.whenPressed(new motor2Backwards());
	  moveBackward.whenReleased(new motor2Stop());
		
	}
	
}

