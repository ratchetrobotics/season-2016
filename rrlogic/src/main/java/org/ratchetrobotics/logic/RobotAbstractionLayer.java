package org.ratchetrobotics.logic;

import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.ratchetrobotics.logic.data.GamepadState;
import org.ratchetrobotics.logic.drivetrain.TankDrivetrain;
import org.ratchetrobotics.logic.events.ButtonEventTrigger;
import org.ratchetrobotics.logic.events.GamepadWatcher;
import org.ratchetrobotics.logic.events.Watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liam on 12/14/15.
 */
public class RobotAbstractionLayer extends OpMode {
  @Override
  public void init() {}

  @Override
  public void loop() {}

  protected TankDrivetrain drivetrain;

  protected DcMotor driveLeftMotors, driveRightMotors;
  protected Servo leftHook, rightHook;

  public void initializeHardware() {
    driveLeftMotors = hardwareMap.dcMotor.get("driveLeftMotors");
    driveRightMotors = hardwareMap.dcMotor.get("driveRightMotors"); driveRightMotors.setDirection(DcMotor.Direction.REVERSE);

    leftHook = hardwareMap.servo.get("leftHook");
    rightHook = hardwareMap.servo.get("rightHook");
    rightHook.setDirection(Servo.Direction.REVERSE);

    drivetrain = new TankDrivetrain(driveLeftMotors, driveRightMotors);
  }
}
