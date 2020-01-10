package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class LowShoot extends CommandBase {
    private final LowShooter lowshooter;

    public LowShoot(final LowShooter lowshoot) {
        lowshooter = lowshoot;
        addRequirements(lowshooter);
    }

    @Override
    public void execute() {
        Robot.getLowShooter().lowshoot(0.6);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
