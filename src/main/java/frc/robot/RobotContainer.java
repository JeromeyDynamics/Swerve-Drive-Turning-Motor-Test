// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.intake.Intake;
import frc.robot.subsystems.intake.IntakeSparkMax;

public class RobotContainer {
  CommandXboxController controller = new CommandXboxController(OIConstants.kDriverControllerPort);
  private final Intake intake = new Intake(new IntakeSparkMax());

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    controller.rightTrigger().whileTrue(intake.intakeOut());
    controller.leftTrigger().whileTrue(intake.intakeIn());
    controller.a().onTrue(intake.turntoDown());
    controller.y().onTrue(intake.turntoUp());
  }
}