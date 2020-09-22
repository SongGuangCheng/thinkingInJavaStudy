package thinking.char05.p85;

public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
