/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ColorSpinner extends SubsystemBase {
  
  //======================================================
  // Instance Variables
  //======================================================

  private final ColorSensorV3 colorSensor;

  private SpeedController spinnerMotor;

  private CheckColor c1;

  public enum CheckColor{
      RED, GREEN, BLUE, YELLOW;
  }

  //======================================================
  // Constructors
  //======================================================

  public ColorSpinner(ColorSensorV3 sensor, SpeedController motor) {
      colorSensor = sensor;
      //spinnerMotor = motor;
  }
  public ColorSpinner(ColorSensorV3 sensor) {
    colorSensor = sensor;
    
  }

  //======================================================
  // Color Sensor Checking
  //======================================================

  public CheckColor checkColor() {
    Color color = colorSensor.getColor();
    if ( color.equals( Color.kRed ) ) {
        c1 = CheckColor.RED;
     }
      else if ( color.equals( Color.kGreen ) ) {
        c1 = CheckColor.GREEN;
      }
      else if ( color.equals( Color.kBlue ) ) {
       c1 = CheckColor.BLUE;
     }
     else {
       c1 = CheckColor.YELLOW;
     }
      return c1;
  }

  //======================================================
  // Motor Spinner ( Unknown data )
  //======================================================


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
