package Medicasoft.capa3_dominio;
import capadominio.Paciente;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteTest {
    
    public PacienteTest() {
    }

    @Test
    public void test1_TieneUnaEdadValida() {
        System.out.println("tieneUnaEdadValida");
        Paciente paciente = new Paciente();
        paciente.setEdadPaciente(15);
        boolean expResult = false;
        boolean result = paciente.validarEdadPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void test2_TieneUnaEdadValida() {
        System.out.println("tieneUnaEdadValida");
        Paciente paciente = new Paciente();
        paciente.setEdadPaciente(18);
        boolean expResult = true;
        boolean result = paciente.validarEdadPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    //TIENE EDAD MAYOR DE 60 AÑOS 
     @Test
    public void test3_TieneUnaEdadValidaparadescuento() {
        System.out.println("tieneUnaEdadValidaparadescuento");
        Paciente paciente = new Paciente();
        paciente.setEdadPaciente(60);
        boolean expResult = true;
        boolean result = paciente.validarEdadParaDescuentoPaciente();
        assertEquals(expResult, result);
}
    
      @Test
    public void test4_TieneUnaEdadValidaparadescuento() {
        System.out.println("tieneUnaEdadValidaparadescuento");
        Paciente paciente = new Paciente();
        paciente.setEdadPaciente(59);
        boolean expResult = false;
        boolean result = paciente.validarEdadParaDescuentoPaciente();
        assertEquals(expResult, result);
}
}
