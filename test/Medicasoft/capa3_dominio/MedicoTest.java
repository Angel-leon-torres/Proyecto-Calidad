
package Medicasoft.capa3_dominio;
import capadominio.Medico;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicoTest {
    
    public MedicoTest() {
    }

    @Test
    public void test1_TieneNumeroMaximoDeAtencionesMedicas() {
        System.out.println("tieneNumeroMaximoDeAtencionesMedicas");
        Medico medico = new Medico();
        medico.setNumeroMaximodeAtencionesPorMedico(9);
        boolean expResult = false;
        boolean result = medico.validarNumeroMaximoDeAtencionesMedicas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
           };
    
     @Test
    public void test2_TieneNumeroMaximoDeAtencionesMedicas() {
        System.out.println("tieneNumeroMaximoDeAtencionesMedicas");
        Medico medico = new Medico();
        medico.setNumeroMaximodeAtencionesPorMedico(15);
        boolean expResult = true;
        boolean result = medico.validarNumeroMaximoDeAtencionesMedicas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
          };

    
    @Test
    public void test3_TieneUnTiempoDeEsperaValido() {
        System.out.println("tieneUnTiempoDeEsperaValido");
        Medico medico = new Medico();
        medico.setTiempoEsperaMedico(15);
        boolean expResult = false;
        boolean result = medico.validarTiempoEspera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    @Test
    public void test4_TieneUnTiempoDeEsperaValido() {
        System.out.println("tieneUnTiempoDeEsperaValido");
        Medico medico = new Medico();
        medico.setTiempoEsperaMedico(8);
        boolean expResult = true;
        boolean result = medico.validarTiempoEspera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
