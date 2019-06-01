package MaterialDeHerramientas;

public class Madera implements  Material{

    private int fuerza;
    private int durabilidad;

    public Madera(){
        this.durabilidad = 100;
        this.fuerza = 2;
    }
    @Override
    public int durabilidad() {
        return this.durabilidad;
    }

    @Override
    public void setFuerzaDePico(){
        this.fuerza = 2;
    }

    @Override
    public void setFuerzaDeHacha(){
        this.fuerza = 2;
    }

    @Override
    public int fuerza(){
        return this.fuerza;
    }
}
