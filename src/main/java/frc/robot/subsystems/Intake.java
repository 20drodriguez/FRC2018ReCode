package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

    /*
    need solenoid
    need two encoders
    need two motors
    need two speed controllers
    need limit switch    
    */
    public Intake() {

        //create limitSwitch cubePresent as digital input    checks if a cube presses the limitSwitch
        //create solenoid mandibles 
        //create encoder leftMandible as digital input
        //create encoder rightMandible as digital input
        //create speed contoller mandibleSpeed as talon SRX
    }

    @Override
    protected void initDefaultCommand() {

    }

    public boolean getCubePresent()
    {
       return true; //cubePresent;
    }

    public void setIntake()
    {
        //mandibleSpeed.setspeed(INSERT VALUE);
    }

}