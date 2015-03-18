package org.usfirst.frc.team1294.robot.commands;

import org.usfirst.frc.team1294.robot.Robot;
import org.usfirst.frc.team1294.robot.utility.ExponentialJoystickFilter;
import org.usfirst.frc.team1294.robot.utility.JoystickFilter;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDriveCommand extends Command {

	private JoystickFilter xFilter;
	private JoystickFilter yFilter;
	
	public ArcadeDriveCommand() {
		requires(Robot.driveTrain);
		
		xFilter = new ExponentialJoystickFilter(1.75, 0.3, .2);
		yFilter = new ExponentialJoystickFilter(1.75, 0.3, .2);
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		double x = xFilter.getOutput(Robot.oi.xboxController.getRightStickX());
		double y = yFilter.getOutput(Robot.oi.xboxController.getRightStickY());
		Robot.driveTrain.arcadeDrive(y, x);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {	
	}

}
