/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;

import edu.wpi.first.wpilibj.I2C.Port;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 * Example: import static frc.robot.Constants.*
 */
public final class Constants {
    /**
     * Device IDs generally represent the hardware resource identifier used in the object's constructor.
     * Device IDs should follow this naming convention:
     * 
     * CAN IDs:         CANID_deviceName                = int
     * PWM channels:    PWM_deviceName                  = int
     * Digital IOs:     DIO_deviceName                  = int
     * Analog inputs:   AIN_deviceName                  = int
     * Relay channels:  RELAY_deviceName                = int
     * PCM channels:    PCMCH_deviceName                = int
     * 
     * I2C ports:       I2C_PORT_deviceName             = I2C.port
     * SPI ports:       SPI_PORT_deviceName             = SPI.Port
     * 
     * USB devices:     USB_deviceName                  = int
     */

    /**
     * TalonFX Can IDs
     */

    public static final int CANID_driveRB = 1;
    public static final int CANID_driveRF = 2;
    public static final int CANID_driveLF = 3;
    public static final int CANID_driveLB = 4;
    
    
    /**
     * TalonSRX Can IDs
     */

    public static final int CANID_intakeShaftMotor = 0;
    public static final int CANID_intakeArmMotor = 1;
    public static final int CANID_climbMotor = 5;
    
    /**
     * VictorSPX Can IDs
     */
    public static final int CANID_colorSpinnerMotor = 4;
    public static final int CANID_spinnerArmMotor = 5;
     

     public static final int CANID_trolleyMotor = 6;
    /**
     * Digital IO
     */
    
     public static final int DIO_intakeShaftTop = 0;
     public static final int DIO_intakeShaftBottom = 1;

    /**
     * Analog Inputs
     */
    
    /**
     * Relay Channel
     */
     public static final int RELAY_climbSolenoid = 0;
     public static final int RELAY_trolleySolenoid = 1;

    /**
     * I2C Ports
     */

    /**
     * USB devices
     */
     public static final int USB_driveController = 0;
     public static final int USB_opController = 1; // op Controller not specifically assigned


    public static final Port I2C_Port_ColorSensor = Port.kOnboard;


}
