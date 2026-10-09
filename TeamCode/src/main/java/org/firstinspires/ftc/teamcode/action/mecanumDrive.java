package org.firstinspires.ftc.teamcode.action;

import android.util.Range;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class mecanumDrive {
    double leftPower;
    double rightPower;
    DcMotor leftDrive
    DcMotor rightDrive

            public static double rotationSpeed=1.0;


            public void  init(@NonNull OpMode opMode){
        HardwareMap hardwaremap = opMode.hardwareMap;
        leftDrive= hardwaremap.get(DcMotor.class,"Left Drive");
        rightDrive=hardwaremap.get(DcMotor.class,"Right Drive");

    }
    public void drive(double movingJoystick, double rotatingJoystick) {
        leftPower= Range.clip(movingJoystick+(rotatingJoystick*rotationSpeed), -1.0,1.0);
        rightPower= Range.clip(movingJoystick-(rotatingJoystick*rotationSpeed), -1.0,1.0);


        leftDrive.setPower(leftPower);
        rightDrive.setPower(rightPower);
    }
}

