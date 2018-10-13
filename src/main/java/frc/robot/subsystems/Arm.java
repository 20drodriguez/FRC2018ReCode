package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

    /*
    need encoder
    need motor
    need limit switch
    need limit switch
    need speed controller
    */

    public Arm() {

        /*
        create encoder armEncoder as digital input
        create limit switch atTop as digital input     check if arm goes too far back
        create limit switch isAtRest as digital input     check if arm is at starting position
        create speed controller armSpeed as talon SRX    
        */

        
    }

    @Override
    protected void initDefaultCommand() {

    }

    //create callSetPosition integrating talon SRX  setPosition function
    //call setPosition and pass the position from OI
    
    //create function atTop that returns boolean value
    //reurn limitswitch value

    //create function isAtRest  
    //return limitswitch value

    //create function getArmPosition
    //return talon reading of position
}