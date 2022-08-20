package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Pinsir extends Pokemon {
    public Pinsir(String S,int i){
        super(S,i);
        setStats(65,125,100,55,70,85);
        setType(Type.BUG);
        setMove(new Swagger(),new ViceGrip(),new BrutalSwing(),new FocusEnergy());
    }
}