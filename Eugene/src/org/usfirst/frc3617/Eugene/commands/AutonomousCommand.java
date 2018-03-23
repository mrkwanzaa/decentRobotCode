// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3617.Eugene.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3617.Eugene.Robot;

/**
 *
 */
public class AutonomousCommand extends Command {

	private boolean finished;
	private int autoMode = -1;
  
    public AutonomousCommand() {

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	finished = false;
    	//if(RobotMap.gunnerStick.getRawAxis(3) >= 0.5){
    		if(Robot.oi.getLeftStick().getRawAxis(3) >= 0.5){
    			autoMode = 1;
    			}
    		else if(Robot.oi.getLeftStick().getRawAxis(3) <= 0.5){
    			autoMode = 3;
    		    }
    		//}
    	/*else if(RobotMap.gunnerStick.getRawAxis(3) <= 0.5){
    		if(RobotMap.driveStick.getRawAxis(3) >= 0.5){
    			Robot.autoMode = 3;
    			}
    		else if(RobotMap.driveStick.getRawAxis(3) <= 0.5){
    			Robot.autoMode = 4;
    		    }
    		}*/
    	//start mode 1
    	if(autoMode == 1){
    		Robot.robotMap.getVictor0().set(-0.8);
    		Robot.robotMap.getVictor1().set(-0.8);// drive forwards half speed
    		Timer.delay(2.6);
    		Robot.robotMap.getVictor0().set(0);
    		Robot.robotMap.getVictor1().set(0);// stop robot
    	}
    	//end mode 1
    	//start mode 2
    	if(autoMode == 2){

    	}	// stop robot
    		  
    		
    	//end mode 2
    	//start mode 3
    	if(autoMode == 3){
    		 
    	}
    	//end mode 3
    	//start mode 4
    	if(autoMode == 4){

    	}
    	//end mode 4
    	else{
    		
    	}
    	finished = true;

    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
