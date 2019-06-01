package Test;
import Herramientas.PicoFino;
import MaterialDeHerramientas.MetalPiedra;
import org.junit.Test;

import static org.junit.Assert.*;

public class PicoFinoTest {
    @Test
    public void PicoFinoRecienCreadoTieneDurabilidad1000(){
        MetalPiedra metalPiedra = new MetalPiedra();
        PicoFino picofino = new PicoFino(metalPiedra);
        assertEquals(1000,picofino.durabilidad());
    }

    @Test
    public void PicoFinoTieneFuerza20(){
        MetalPiedra metalPiedra = new MetalPiedra();
        PicoFino picofino = new PicoFino(metalPiedra);
        assertEquals(20, picofino.fuerza());
    }
}
