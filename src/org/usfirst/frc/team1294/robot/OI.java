package org.usfirst.frc.team1294.robot;

import org.usfirst.frc.team1294.robot.utility.VersionFinder;
import org.usfirst.frc.team1294.robot.utility.Xbox360Controller;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Xbox360Controller xboxController;
	
	public OI() {
		
		xboxController = new Xbox360Controller(0);
		
		SmartDashboard.putString("Code Version", VersionFinder.getAttribute(this, VersionFinder.VERSION_ATTRIBUTE));
		SmartDashboard.putString("Code Built By", VersionFinder.getAttribute(this, VersionFinder.BUILT_BY_ATTRIBUTE));
		SmartDashboard.putString("Code Built At", VersionFinder.getAttribute(this, VersionFinder.BUILT_AT_ATTRIBUTE));
	}
	
	
}

