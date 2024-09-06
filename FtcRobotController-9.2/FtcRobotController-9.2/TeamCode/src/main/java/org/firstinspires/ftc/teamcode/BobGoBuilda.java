package org.firstinspires.ftc.teamcode;

import static com.google.blocks.ftcrobotcontroller.util.Identifier.GAMEPAD_1;
import static com.google.blocks.ftcrobotcontroller.util.Identifier.POSITION;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.config.Config;
@Config
@TeleOp()

public class BobGoBuilda extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        double forwardPower = gamepad1.left_stick_y * -1;
        double strafePower = gamepad1.left_stick_x * -1;
        double turnPower = gamepad1.right_stick_x * -1;
        Robot_hardware myOpmode = new Robot_hardware(this);
        myOpmode.setpower(forwardPower, strafePower, turnPower);
    }
}
