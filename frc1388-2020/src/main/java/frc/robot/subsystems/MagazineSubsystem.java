/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import java.lang.Math;

/**
 * Add your docs here.
 */
public class MagazineSubsystem extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  AnalogInput ballSensor;
  final double MIN_VOLTAGE = 0.00001;
  final double MAX_DISTANCE = 35.0;
  final double MIN_DISTANCE = 4.5;
  final double DISTANCE_MULTIPLIER = 12.84;
  final double VOLTAGE_EXPONENT = -0.9824;
  final double IS_BALL_VALUE = 45;

  public MagazineSubsystem() {
    ballSensor = new AnalogInput(Constants.AIN_ballSensor);
  }

  public double getDistance() {
    double voltage = 0;
    double distance = 0;

    // Don't allow zero/negative values
    voltage = Math.max(ballSensor.getVoltage(), MIN_VOLTAGE);
    distance = DISTANCE_MULTIPLIER * Math.pow(voltage, VOLTAGE_EXPONENT);

    // Constrain output
    distance = Math.max(Math.min(distance, MAX_DISTANCE), MIN_DISTANCE);

    return distance;
  }

  public boolean ballIsPresent() {
    boolean ballPresent = false;
    if(getDistance() > IS_BALL_VALUE){
      ballPresent = false;
      System.out.println("false");
    }
    if(getDistance() <IS_BALL_VALUE){
      ballPresent = true;
      System.out.println("true");
    }
    return ballPresent;
  }
}
