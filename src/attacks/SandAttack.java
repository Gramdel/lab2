package attacks;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.GROUND,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ACCURACY,-2);
    }
    @Override
    protected String describe(){
        return "Атака SandAttack: точность оппонента уменьшена на 2 пункта";
    }
}