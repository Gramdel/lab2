package attacks;
import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {
    private String s = "";
    public ThunderFang(){ super(Type.ELECTRIC,65,95); }
    @Override
    protected void applyOppEffects(Pokemon p){
        if ((int) (Math.random() * 10) == 0) {
            Effect.paralyze(p);
            s = ": оппонент парализован";
        } else if ((int) (Math.random() * 10) == 0) {
            Effect.flinch(p);
            s = ": оппонент испуган";
        }
    }
    @Override
    protected String describe(){
        return "Атака ThunderFang";
    }
}