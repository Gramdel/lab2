package attacks;
import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends PhysicalMove {
    public FocusEnergy(){
        super(Type.NORMAL,30,100);
    }
    @Override
    protected double calcCriticalHit(Pokemon p1, Pokemon p2) {
        if (p1.getStat(Stat.SPEED) / 256.0D > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }
    }
    @Override
    protected String describe(){
        return "Атака FocusEnergy: шанс крита увеличен";
    }
}