package Herramientas;

import MaterialDeHerramientas.Material;

public class Pico {
    private Material material;

    public Pico(Material material) {
        this.material = material;
        this.material.setFuerzaDePico();
    }

    public int durabilidad() {
        return this.material.durabilidad();
    }

    public int fuerza() {
        return this.material.fuerza();
    }
}
