package Herramientas;
import MaterialDeHerramientas.MetalPiedra;

public class PicoFino {
    private MetalPiedra material;


    public PicoFino( MetalPiedra material) {
        this.material = material;
    }

    public int durabilidad() {
        return this.material.durabilidad();
    }

    public int fuerza(){
        return this.material.fuerza();
    }
}
