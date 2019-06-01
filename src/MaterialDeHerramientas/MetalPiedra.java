package MaterialDeHerramientas;

public class MetalPiedra {
    private int durabilidad;
    private int fuerza;

    public MetalPiedra(){
        this.durabilidad = 1000;
        this.fuerza =  20;
    }


    public int durabilidad() {
        return this.durabilidad;
    }

    public int fuerza() {
        return this.fuerza;
    }
}
