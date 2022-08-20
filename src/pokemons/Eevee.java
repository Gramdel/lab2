package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Eevee extends Pokemon {
    public Eevee(String S,int i){
        super(S,i);
        setStats(55,55,50,45,65,55);
        setType(Type.NORMAL);
        setMove(new SandAttack(),new ShadowBall(),new Tackle());
    }
}