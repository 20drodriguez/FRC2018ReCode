package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Wrist extends Subsystem {

    public Wrist() {
        //encoder mWristPosition = new encoder
        //talonSRX mWristSpeed = new talonSRX
        //solenoid mWristTooFarBack = new solenoid
    }

    @Override
    protected void initDefaultCommand() {

    }

    public double getWristPosition()
    {
        return 5.5; //return wristPosition.position() 
    }

    public void setWristPosition(double position)
    {
       // wristSpeed.setPosition(position);
       int placeHolder;
    }

    public boolean getWristTooFarBack()
    {
        return false;
        //return mWristTooFarBack.isTheWristTooFarBackOrWhatLikeWhatIsThisJawnDoing();
    }
}

