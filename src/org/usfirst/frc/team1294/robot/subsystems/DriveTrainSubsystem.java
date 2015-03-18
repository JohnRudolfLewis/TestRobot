package org.usfirst.frc.team1294.robot.subsystems;

import org.usfirst.frc.team1294.robot.commands.ArcadeDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class DriveTrainSubsystem extends Subsystem {
	private RobotDrive robotDrive;
	private TalonSRX leftTalon;
	private TalonSRX rightTalon;
	
	public DriveTrainSubsystem() {
		leftTalon = new TalonSRX(0);
		LiveWindow.addActuator("DriveTrain", "LeftTalon", leftTalon);
		
		rightTalon = new TalonSRX(1);
		LiveWindow.addActuator("DriveTrain", "RightTalon", rightTalon);

		robotDrive = new RobotDrive(leftTalon, rightTalon);
		robotDrive.setSafetyEnabled(true);
		robotDrive.setExpiration(0.1);
		robotDrive.setSensitivity(0.5);

	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new ArcadeDriveCommand());
	}
	
	public void arcadeDrive(double moveValue, double rotateValue) {
		robotDrive.arcadeDrive(moveValue, rotateValue);
	}
}
