package attacks;
import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    private String s = "";
    public Bubble(){
        super(Type.WATER,40,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if ((int) (Math.random() * 10) == 0) {
            p.setMod(Stat.SPEED,-2);
            s = ": скорость оппонента уменьшена на 2 пункта";
        }
    }
    @Override
    protected String describe(){
        return "Атака Rest"+s;
    }
}
