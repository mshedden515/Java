package fileSystem.condiciones;

import fileSystem.ElementoFS;

public class CondicionOr extends Condicion{
    private Condicion c1,c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return c1.cumple(e) || c2.cumple(e);
    }
}
