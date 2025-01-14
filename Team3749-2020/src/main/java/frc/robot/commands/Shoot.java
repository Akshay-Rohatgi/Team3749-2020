package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Shoot extends CommandBase {
    private final Shooter shooter;

    public Shoot(final Shooter shoot) {
        shooter = shoot;
        addRequirements(shooter);
    }

    @Override
    public void execute() {
        Robot.getShooter().shoot(0.7);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}