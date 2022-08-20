package attacks;
import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    public AquaRing(){
        super(Type.WATER,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.HP,(int) p.getStat(Stat.HP)*17/16);
        p.setCondition(e);
    }
    @Override
    protected String describe(){
        return "Атака AquaRing: здоровье увеличено на 6.25% от текущего";
    }
}
