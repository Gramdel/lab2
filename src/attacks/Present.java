package attacks;
import ru.ifmo.se.pokemon.*;

public class Present extends SpecialMove {
    private String s = "";
    public Present(){
        super(Type.NORMAL,(int) (Math.random()*81+40)*(int) (Math.random()*2),90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (this.power==0) {
            Effect e = new Effect().stat(Stat.HP,(int) p.getStat(Stat.HP)*5/4);
            p.setCondition(e);
            s = ": здоровье оппонента увеличено на 25% от текущего";
        } else {
            super.applyOppEffects(p);
        }
    }
    @Override
    protected String describe(){
        return "Атака Present"+s;
    }
}