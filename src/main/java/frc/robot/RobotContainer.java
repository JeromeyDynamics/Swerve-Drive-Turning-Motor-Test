// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.drive.SwerveMotor;
import frc.robot.subsystems.drive.SwerveSparkMax;

public class RobotContainer {
  CommandXboxController controller = new CommandXboxController(OIConstants.kDriverControllerPort);

  private final SwerveMotor motor2 = new SwerveMotor(new SwerveSparkMax(2));
  private final SwerveMotor motor6 = new SwerveMotor(new SwerveSparkMax(6));

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    controller.a().toggleOnTrue(motor2.spinCounterclockwise())
        .and(controller.a().negate()).toggleOnTrue(motor2.stopMotor());
    
    controller.b().toggleOnTrue(motor2.spinCounterclockwise())
        .and(controller.b().negate()).toggleOnTrue(motor2.stopMotor());
    
    controller.x().toggleOnTrue(motor6.spinCounterclockwise())
        .and(controller.x().negate()).toggleOnTrue(motor6.stopMotor());
    
    controller.y().toggleOnTrue(motor6.spinCounterclockwise())
        .and(controller.y().negate()).toggleOnTrue(motor6.stopMotor());
  }
}