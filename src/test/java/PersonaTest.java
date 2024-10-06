import org.example.Persona.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testPersona() {
        Persona persona = new Persona("Johna", 25);
        assertEquals("Johna", persona.getNombre());
    }
}