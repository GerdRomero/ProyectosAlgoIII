package MaterialDeHerramientas;

public class Piedra implements Material{
    private int durabilidad;
    private int fuerza;

    public Piedra(){
        this.durabilidad = 200;
    }

    @Override
    public int durabilidad() {
        return this.durabilidad;
    }

    @Override
    public void setFuerzaDeHacha(){
        this.fuerza = 5;
    }

    @Override
    public void setFuerzaDePico(){
        this.fuerza = 4;
    }

    @Override
    public int fuerza(){
        return this.fuerza;
    }
}
