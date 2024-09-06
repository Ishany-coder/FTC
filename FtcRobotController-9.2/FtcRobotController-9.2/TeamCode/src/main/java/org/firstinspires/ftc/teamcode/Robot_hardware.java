package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.opencv.core.Mat;

public class Robot_hardware {
    // initialize the variables
    public OpMode myOpMode = null;

    private DcMotor LF = null;
    private DcMotor RF = null;
    private DcMotor LB = null;
    private DcMotor RB = null;
    // constructor robot hardware to initialize all the motor values
    public Robot_hardware(OpMode opmode) {
        myOpMode = opmode;
        // Define and Initialize Motors (note: need to use reference to actual OpMode).
        LF = myOpMode.hardwareMap.get(DcMotor.class, "LF");
        RF = myOpMode.hardwareMap.get(DcMotor.class, "RF");
        LB = myOpMode.hardwareMap.get(DcMotor.class, "LB");
        RB = myOpMode.hardwareMap.get(DcMotor.class, "RB");
        // set motor direction
        RB.setDirection(DcMotorSimple.Direction.REVERSE);
        RF.setDirection(DcMotorSimple.Direction.REVERSE);
        LF.setDirection(DcMotorSimple.Direction.FORWARD);
        LB.setDirection(DcMotorSimple.Direction.FORWARD);
        // tell the motors to run without encoders because we are using odometery instead
        LF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        RB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        RF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //when the motor has zero power we want it to break and not do anything else like coast
        LF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    // function to set power
    public void setpower(double forwardPower, double strafePower, double turnpower){
        // if the forward power + the strafe power + thhe turnpower is greater than 1 we save that value to divide with it later
        double denominator = Math.max(Math.abs(forwardPower) + Math.abs(strafePower) + Math.abs(turnpower), 1);
        // set the motor power and if its greater than 1 we divide it by denominator making it one
        RF.setPower((forwardPower - strafePower - turnpower) / denominator);
        RB.setPower((forwardPower + strafePower - turnpower) / denominator);
        LF.setPower((forwardPower + strafePower + turnpower) / denominator);
        LB.setPower((forwardPower - strafePower + turnpower) / denominator);
    }
}

