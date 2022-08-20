package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Jolteon extends Eevee {
    public Jolteon(String S,int i){
        super(S,i);
        setStats(65,65,60,110,95,130);
        setType(Type.ELECTRIC);
        addMove(new ThunderFang());
    }
}
