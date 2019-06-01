package Herramientas;
import MaterialDeHerramientas.Material;

public class Hacha {
    private Material material;

    public Hacha(Material material){
        this.material = material;
        this.material.setFuerzaDeHacha();
    }

    public int durabilidad() {
        return this.material.durabilidad();
    }

    public int fuerza() {
        return this.material.fuerza();
    }
}
