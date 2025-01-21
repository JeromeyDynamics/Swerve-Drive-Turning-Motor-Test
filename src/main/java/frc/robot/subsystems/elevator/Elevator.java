package frc.robot.subsystems.elevator;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class Elevator extends SubsystemBase {
    private final ElevatorIO elevatorIO;

    public Elevator(ElevatorIO elevatorIO) {
        this.elevatorIO = elevatorIO;
    }

    public Command raiseElevator() {
        return run(
            () -> elevatorIO.setMotorSpeed(ElevatorConstants.kElevatorRaiseSpeed)
        );
    }

    public Command lowerElevator() {
        return run(
            () -> elevatorIO.setMotorSpeed(-ElevatorConstants.kElevatorRaiseSpeed)
        );
    }

    public Command stopElevator() {
        return run(
            () -> elevatorIO.stop()
        );
    }
}
