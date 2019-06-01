package Test;

import Herramientas.Pico;
import MaterialDeHerramientas.Madera;
import MaterialDeHerramientas.Metal;
import MaterialDeHerramientas.Piedra;
import org.junit.Test;
import static org.junit.Assert.*;

public class PicoTest {
    @Test
    public void PicoDeMaderaRecienCreadoTiene100DeDurabilidad() {
        Madera madera = new Madera();
        Pico pico = new Pico(madera);
        assertEquals(100, pico.durabilidad());
    }

    @Test
    public void PicoDeMaderaTiene2DeDurabilidad(){
        Madera madera = new Madera();
        Pico pico = new Pico(madera);
        assertEquals(2, pico.fuerza());
    }

    @Test
    public void PicoDePiedraRecienCreadoTiene200DeDurabilidad(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(piedra);
        assertEquals(200, pico.durabilidad());
    }

    @Test
    public void PicoDePiedraTiene4DeFuerza(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(piedra);
        assertEquals(4, pico.fuerza());
    }

    @Test
    public void PicoDeMetalRecienCreadoTiene400DeDurabilidad(){
        Metal metal = new Metal();
        Pico pico = new Pico(metal);
        assertEquals(400, pico.durabilidad());
    }

    @Test
    public void PicoDeMetalTiene12DeFuerza(){
        Metal metal = new Metal();
        Pico pico = new Pico(metal);
        assertEquals(12, pico.fuerza());
    }
}
