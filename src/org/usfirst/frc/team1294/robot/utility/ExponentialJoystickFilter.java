package org.usfirst.frc.team1294.robot.utility;

public class ExponentialJoystickFilter extends JoystickFilter {

	private final double deadzone;
	private final double minimum;
	private final double exponential;
	
	public ExponentialJoystickFilter(double exponential, double deadzone, double minimum) {
		super();
		this.deadzone = deadzone;
		this.minimum = minimum;
		this.exponential = exponential;		
	}
	
	@Override
	public double getOutput(double input) {
		if (input > -deadzone && input < deadzone) {
			return 0;
		}
		
		if (input >= deadzone && input <= 1) {
			return (Math.pow(input, 3) * (exponential-1) + input) / exponential + minimum * (1 - input);
		}
		
		if (input <= -deadzone && input >= -1) {
			return (Math.pow(input, 3) * (exponential-1) + input) / exponential - minimum * (1 + input);
		}
		
		return 0;
	}

}
