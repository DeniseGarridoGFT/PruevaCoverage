import org.example.Persona.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testPersona() {
        Persona persona = new Persona("Norly", 1600);
        assertEquals("Norly", persona.getNombre());
    }
}