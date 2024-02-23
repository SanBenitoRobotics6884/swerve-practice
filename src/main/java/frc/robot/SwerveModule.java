// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import javax.print.CancelablePrintJob;

import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.hal.can.CANStreamOverflowException;

/** Add your docs here. */
public class SwerveModule { 
    CANSparkMax m_rotateMotor;
    CANSparkMax m_driveMotor;

    CANcoder m_encoder;
    public SwerveModule(int rotateMotorID) {

    }


}
