// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class MusicTest extends CommandBase {

  private ShooterSubsystem m_shooterSubsystem;

  private Timer m_timer = new Timer();
  private boolean done = false;

  /** Creates a new MusicTest. */
  public MusicTest(ShooterSubsystem shooterSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_shooterSubsystem = shooterSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_timer.get() < 2) {
      m_shooterSubsystem.playTone(250);
    } else if (m_timer.get() < 4) {
      m_shooterSubsystem.playTone(375);
    } else if (m_timer.get() < 6) {
      m_shooterSubsystem.playTone(500);
    // } else if (m_timer.get() < 8) {
    //   m_shooterSubsystem.playTone(750);
    // } else if (m_timer.get() < 10) {
    //   m_shooterSubsystem.playTone(1000);
    } else {
      done = true;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_shooterSubsystem.playTone(0);
    m_timer.stop();
    m_timer.reset();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return done;
  }
}
