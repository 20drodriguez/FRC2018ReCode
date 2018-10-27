package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

    public Drive() {
/*
create Gyro driveGyro
create speed controller driveBaseLeft as talonSRX object
create speed controller driveBaseRight as talonSRX object

*/

//I have no idea what the proper syntax or function calls actually are for the objects and what they return
    }

    @Override
    protected void initDefaultCommand() {

    }

    public void setSpeedRight(double speed)
    {
        //driveBaseRight.setSpeed(speed)
    }

    public void setSpeedLeft(double speed)
    {
        //driveBaseLeft.setSpeed(speed)
    }

    public double getSpeedRight()
    {
        return 5.5;//driveBaseRight.speed();
    }

    public double getSpeedLeft()
    {
        return 5.5;//driveBaseLeft.speed();
    }

    public double getDriveGryro()
    {
        return 5.5;//driveGyro.value();
    }

}