package attacks;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP);
        p.setCondition(e);
        p.setMod(Stat.HP,-6);
    }
    @Override
    protected String describe(){
        return "Атака Rest: здоровье восстановлено, засыпает";
    }
}
