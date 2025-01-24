package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveMotor extends SubsystemBase {
    private final SwerveSparkMax motorSparkMax;

    public SwerveMotor(SwerveSparkMax motorSparkMax) {
        this.motorSparkMax = motorSparkMax;
    }

    public Command spinClockwise() {
        return run(
            () -> motorSparkMax.setMotorSpeed(0.5));
    }

    public Command spinCounterclockwise() {
        return run(
            () -> motorSparkMax.setMotorSpeed(-0.5));
    }

    public Command stopMotor() {
        return run(
            () -> motorSparkMax.stop());
    }
}
