package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Azurill extends Pokemon {
    public Azurill(String S,int i){
        super(S,i);
        setStats(50,20,40,20,40,20);
        setType(Type.NORMAL,Type.FAIRY);
        setMove(new Rest(),new Bubble());
    }
}
