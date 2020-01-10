package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

public class LowShooter extends SubsystemBase {
  private VictorSPX lowshooterMotor;

  public LowShooter() {
    lowshooterMotor = new VictorSPX(Robot.getMap().getCAN("wheel_right"));
  }

  public void lowshoot(double speed) {
    lowshooterMotor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
