package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class botLift extends Subsystem {

    Victor liftMotor = new Victor(7);
    DigitalInput topSwitch, botSwitch;
    Counter topCounter, botCounter;
    
    public botLift() {
      topSwitch = new DigitalInput(0);
      botSwitch = new DigitalInput(1);
      topCounter = new Counter(topSwitch);
      botCounter = new Counter(botSwitch);

      LiveWindow.addActuator("botLift", "Motor", liftMotor);
      LiveWindow.addSensor("botLift", "Top Switch", topSwitch);
      LiveWindow.addSensor("botLift", "Top Count", topCounter);
      LiveWindow.addSensor("botLift", "Bot Switch", botSwitch);
      LiveWindow.addSensor("botLift", "Bot Count", botCounter);
    }
    
    /**
     * @return Number of times the top limit switch has been hit.
     */
    public int getTopCount() {
    	return topCounter.get();
    }
    
    /**
     * @return Number of times the bottom limit switch has been hit.
     */
    public int getBotCount() {
    	return botCounter.get();
    }

    public void liftUp() {
    	double power = 1;
        // stop motor if attempt is made to go past the top
    	if (topSwitch.get()) {
    		power = 0;
    	}
    	liftMotor.set(power);
    }

    public void liftDown() {
    	double power = -1;
        // stop motor if attempt made to go past bottom
    	if (botSwitch.get()) {
    		power = 0;
    	}
        liftMotor.set(power);
    }

    public void liftStop() {
        liftMotor.set(0);
    }
    protected void initDefaultCommand() {
    }
}