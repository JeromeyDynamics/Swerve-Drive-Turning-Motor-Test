package frc.robot.subsystems.drive;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;

public interface SwerveDriveIO {
    public Pose2d getPose();

    public void resetOdometry(Pose2d pose);

    public void drive(double xSpeed, double ySpeed, double rot, boolean fieldRelative);

    public void setX();
    
    public void setModuleStates(SwerveModuleState[] desiredStates);

    public void resetEncoders();

    public void zeroHeading();

    public double getHeading();

    public double getTurnRate();
}
