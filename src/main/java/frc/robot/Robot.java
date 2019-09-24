
package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends TimedRobot {

  TalonSRX motor1;
  Joystick joy;
  double speed;

  @Override
  public void robotInit() {
    motor1 = new TalonSRX(1); 
    joy = new Joystick(0);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopPeriodic() {
    speed = joy.getRawAxis(5);
    motor1.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void testPeriodic() {
  }
}
