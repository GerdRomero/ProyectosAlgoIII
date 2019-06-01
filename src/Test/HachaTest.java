package Test;

import Herramientas.Hacha;
import MaterialDeHerramientas.Madera;
import MaterialDeHerramientas.Metal;
import MaterialDeHerramientas.Piedra;
import org.junit.Test;
import static org.junit.Assert.*;

public class HachaTest {
    @Test
    public void HachaDeMaderaRecienCreadaTiene100DeDurabilidad(){
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);
        assertEquals(100,hacha.durabilidad());
    }

    @Test
    public void HachaDeMaderaRecienCreadaTiene2DeFuerza(){
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);
        assertEquals(2,hacha.fuerza());
    }

    @Test
    public void HachaDePiedraRecienCreadaTiene200DeDurabilidad(){
        Piedra piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        assertEquals(200,hacha.durabilidad());
    }

    @Test
    public void HachaDePiedraRecienCreadaTiene5DeFuerza(){
        Piedra piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        assertEquals(5,hacha.fuerza());
    }

    @Test
    public void HachaDeMetalRecienCreadaTiene400DeDurabilidad(){
        Metal metal = new Metal();
        Hacha hacha = new Hacha(metal);
        assertEquals(400,hacha.durabilidad());
    }

    @Test
    public void HachaDeMetalRecienCreadaTiene10DeFuerza(){
        Metal metal = new Metal();
        Hacha hacha = new Hacha(metal);
        assertEquals(10,hacha.fuerza());
    }
}
