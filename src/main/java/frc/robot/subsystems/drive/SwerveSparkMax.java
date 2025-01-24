package frc.robot.subsystems.drive;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class SwerveSparkMax implements SwerveMotorIO {
    private final SparkMax motor;

    public SwerveSparkMax(int motorID) {
        motor = new SparkMax(motorID, MotorType.kBrushless);
    }

    @Override
    public void setMotorSpeed(double speed) {
        motor.set(speed);
    }

    @Override
    public void stop() {
        motor.set(0);
    }
}
