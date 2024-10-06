import org.example.Persona.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testPersona() {
        Persona persona = new Persona("Norly", 1450);
        assertEquals("Norly", persona.getNombre());
    }
    @Test
    public void testSueldo() {
        Persona persona = new Persona("Norly", 1450);
        assertEquals(1450, persona.getSaldo());
    }
}