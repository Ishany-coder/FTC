package org.firstinspires.ftc.teamcode;
//import files
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
@TeleOp
public class Hw extends OpMode {
    // Create new robot hardware objects
    Robot_hardware myHardware = new Robot_hardware(this);
    //get input from gamepad
    double forwardPower = gamepad1.left_stick_y * -1;
    double strafePower = gamepad1.left_stick_x * -1;
    double turnPower = gamepad1.right_stick_x * -1;
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //set all the motor powers using a custom method inside robot hardware
        myHardware.setpower(forwardPower, strafePower, turnPower);
    }
}
