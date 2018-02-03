package org.usfirst.frc.team5829.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class autonomousMiddle extends CommandGroup {

    public autonomousMiddle() {
    	addSequential(new gearLifterLengthDown(-100));
    	addSequential(new driveForward(88.5));
    	addSequential(new gearLifterLengthDown(-1500));
    	//addSequential(new driveForward(-40));
    	//addSequential(new turnDegree(-76.25));
    	//addSequential(new driveForward(20));
    	//addSequential(new shootAndIntake());
    	
    	//addSequential(new driveForward(-10));
    	//addSequential(new driveForward(-25));
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
