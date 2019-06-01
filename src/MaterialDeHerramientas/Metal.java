package MaterialDeHerramientas;

public class Metal implements Material{
    private int durabilidad;
    private int fuerza;

    public Metal(){
        this.durabilidad = 400;
    }

    @Override
    public int durabilidad() {
        return this.durabilidad;
    }

    @Override
    public void setFuerzaDeHacha() {
        this.fuerza = 10;
    }

    @Override
    public void setFuerzaDePico() {
        this.fuerza = 12;
    }

    @Override
    public int fuerza() {
        return this.fuerza;
    }
}
