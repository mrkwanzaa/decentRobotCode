// RobotBuilder Version: 2.0

package org.usfirst.frc3617.Eugene;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;


/**
 * The RobotMap is a mapping for the motor controllers. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
	private Victor victor0 = new Victor(0);
	private Victor victor1 = new Victor(1);
	private Victor victor2 = new Victor(2);
	private Victor victor3 = new Victor(3);
	
	private Spark spark4 = new Spark(4);
	private Spark spark5 = new Spark(4);
	private Spark spark6 = new Spark(4);
	private Spark spark7 = new Spark(4);
    // End motor controller mapping. 

    public Victor getVictor0() {
		return victor0;
	}

	public Victor getVictor1() {
		return victor1;
	}

	public Victor getVictor2() {
		return victor2;
	}

	public Victor getVictor3() {
		return victor3;
	}

	public Spark getSpark4() {
		return spark4;
	}

	public Spark getSpark5() {
		return spark5;
	}

	public Spark getSpark6() {
		return spark6;
	}

	public Spark getSpark7() {
		return spark7;
	}

	public static void init() {
		
    }
}
