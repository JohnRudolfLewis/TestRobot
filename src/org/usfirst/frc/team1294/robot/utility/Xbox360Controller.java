package org.usfirst.frc.team1294.robot.utility;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Xbox360Controller extends Joystick {

	private final JoystickButton buttonA;
	private final JoystickButton buttonB;
	private final JoystickButton buttonX;
	private final JoystickButton buttonY;
	private final JoystickButton leftBumper;
	private final JoystickButton rightBumper;
	private final JoystickButton leftStickButton;
	private final JoystickButton rightStickButton;
	private final JoystickButton startButton;
	private final JoystickButton selectButton;
	
	public Xbox360Controller(int port) {
		super(port);
		buttonA = new JoystickButton(this,0);
		buttonB = new JoystickButton(this,1);
		buttonX = new JoystickButton(this,2);
		buttonY = new JoystickButton(this,3);
		leftBumper = new JoystickButton(this, 4);
		rightBumper = new JoystickButton(this, 5);
		leftStickButton = new JoystickButton(this, 8);
		rightStickButton = new JoystickButton(this, 9);
		startButton = new JoystickButton(this, 7);
		selectButton = new JoystickButton(this, 6);
		
	}
	
	public double getRightStickX() {
		return getRawAxis(4);
	}
	
	public double getRightStickY() {
		return getRawAxis(5);
	}
	
	public double getLeftStickX() {
		return getRawAxis(0);
	}
	
	public double getLeftStickY() {
		return getRawAxis(1);
	}
	
	public double getLeftTrigger() {
		return getRawAxis(2);
	}
	
	public double getRightTrigger() {
		return getRawAxis(3);
	}

	public JoystickButton getButtonA() {
		return buttonA;
	}
	
	public JoystickButton getButtonB() {
		return buttonB;
	}
	
	public JoystickButton getButtonX() {
		return buttonX;
	}
	
	public JoystickButton getButtonY() {
		return buttonY;
	}
	
	public JoystickButton getLeftBumper() {
		return leftBumper;
	}
	
	public JoystickButton getRightBumper() {
		return rightBumper;
	}

	public JoystickButton getLeftStickButton() {
		return leftStickButton;
	}

	public JoystickButton getRightStickButton() {
		return rightStickButton;
	}

	public JoystickButton getStartButton() {
		return startButton;
	}

	public JoystickButton getSelectButton() {
		return selectButton;
	}
}