package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveMotor extends SubsystemBase {
    private final SwerveMotorIO motor;

    public SwerveMotor(SwerveMotorIO motor) {
        this.motor = motor;
    }

    public Command spinClockwise() {
        return run(
            () -> motor.setMotorSpeed(0.5));
    }

    public Command spinCounterclockwise() {
        return run(
            () -> motor.setMotorSpeed(-0.5));
    }

    public Command stopMotor() {
        return run(
            () -> motor.stop());
    }
}
