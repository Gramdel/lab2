package attacks;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    private String s = "";
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if ((int) (Math.random() * 5) == 0) {
            p.setMod(Stat.SPECIAL_DEFENSE, -2);
            s = ": специальная защита оппонента уменьшена на 2 пункта";
        }
    }
    @Override
    protected String describe(){
        return "Атака ShadowBall" + s;
    }
}