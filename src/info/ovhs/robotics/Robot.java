
package info.ovhs.robotics;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	//two speedcontrollers are being used. One on each side
	
	//assigns a Victor speedcontroller to the left and right. 
	Victor leftFrontMotor = new Victor(0);
	Victor rightFrontMotor = new Victor(1);
	Victor leftBackMotor = new Victor(2);
	Victor rightBackMotor = new Victor(3);
	
	//creates object to control the robot with mecanum drive
	Joystick leftJoystick = new Joystick(0);
	Joystick rightJoystick = new Joystick(1);
	
	//create object to use drive motors
	RobotDrive testBotDrive = new RobotDrive(leftBackMotor, leftFrontMotor, rightBackMotor, rightFrontMotor);

	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	//makes robotdrive as mecanum
    	double xAxisLeft = leftJoystick.getAxis(Joystick.AxisType.kX);
    	double yAxisLeft = rightJoystick.getAxis(Joystick.AxisType.kY);
    	double xAxisRight = rightJoystick.getAxis(Joystick.AxisType.kX);
    	testBotDrive.mecanumDrive_Cartesian(xAxisLeft, yAxisLeft, xAxisRight, 0);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
