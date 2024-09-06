package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class practiceJava extends OpMode {
    private DcMotor LF;
    private long startTime;

    @Override
    public void init() {
        // Initialize the motor
        LF = hardwareMap.get(DcMotor.class, "LFMotor");
    }

    @Override
    public void start() {
        // Record the start time when the OpMode starts
        startTime = System.currentTimeMillis();
        LF.setPower(1);  // Start the motor
    }

    @Override
    public void loop() {
        // Check if 5 seconds have passed
        if (System.currentTimeMillis() - startTime >= 5000) {
            LF.setPower(0);  // Stop the motor after 5 seconds
            try {
                // Sleep for 2 seconds (5000 milliseconds)
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // Handle the exception if the sleep is interrupted
                System.err.println("Sleep was interrupted: " + e.getMessage());
            }
        }

        // You can add telemetry or other logic here
        telemetry.addData("Motor Power", LF.getPower());
        telemetry.addData("Elapsed Time", System.currentTimeMillis() - startTime);
        telemetry.update();
    }
}



