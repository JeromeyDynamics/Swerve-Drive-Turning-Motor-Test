package frc.robot.subsystems.elevator;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import frc.robot.Constants.ElevatorConstants;

public class ElevatorSparkMax implements ElevatorIO {
    private final SparkMax motor;

    public ElevatorSparkMax() {
        motor = new SparkMax(ElevatorConstants.kElevatorMotorCanId, MotorType.kBrushless);
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
