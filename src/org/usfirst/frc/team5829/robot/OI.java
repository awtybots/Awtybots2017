package org.usfirst.frc.team5829.robot;
import org.usfirst.frc.team5829.robot.commands.Intake;
import org.usfirst.frc.team5829.robot.commands.Shoot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick xbox = new Joystick(0);
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	Button btnA = new JoystickButton(xbox, 1);
	Button btnB = new JoystickButton(xbox, 2);
	Button btnX = new JoystickButton(xbox, 3);
	Button btnR1 = new JoystickButton(xbox, 6);
	Button btnY = new JoystickButton(xbox,4);
	Button btnS = new JoystickButton(xbox, 8);
	
    
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
	
	public OI(){
			btnA.whenPressed(new Shoot(925));
		    btnB.whenPressed(new Shoot(950));
		    btnX.whenPressed(new Shoot(1000));
		    btnY.whenPressed(new Shoot(0)); 

		    
		
	}
}


