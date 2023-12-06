package Medicasoft.capa3_dominio;
import capadominio.Cita;
import org.junit.Test;
import static org.junit.Assert.*;

public class CitaTest {
    
    public CitaTest() {
    }


//costo de comicion medicina general
    @Test
    public void test1_calcularcomisionporespecialidad() {
        System.out.println("1-->calcularcomisionporespecialidad");
        String especialidad = "Medicina General";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 4.5;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void test1_1calcularcomisionporespecialidad() {
        System.out.println("1.1-->calcularcomisionporespecialidad");
        String especialidad = "Medicina General";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 0;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
         
//costo especialidad mas comicion medicina general
         @Test
        public void test1_calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("1-->calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Medicina General";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 94.5;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
        @Test
        public void test1_1calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("1.1-->calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Medicina General";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 90;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
       
    }
  
//costo de comicion pediatria
  @Test
    public void test2_calcularcomisionporespecialidad() {
        System.out.println("2-->calcularcomisionporespecialidad");
        String especialidad = "Pediatria";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 4;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void test2_1calcularcomisionporespecialidad() {
        System.out.println("2.1-->calcularcomisionporespecialidad");
        String especialidad = "Pediatria";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 0;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
                
//costo especialidad mas comicion pediatria
         @Test
        public void test2_CalcularElCostoDelTipoDeEspecialidadPorElEstadoDeGravedad() {
        System.out.println("2--> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Pediatria";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 84;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
       
          @Test
        public void test2_1CalcularElCostoDelTipoDeEspecialidadPorElEstadoDeGravedad() {
        System.out.println("2.1 --> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Pediatria";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 80;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
       
 //costo de comicion obstetricia
  @Test
    public void test3_calcularcomisionporespecialidad() {
        System.out.println("3-->calcularcomisionporespecialidad");
        String especialidad = "Obstetricia";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 2.5;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void test3_1calcularcomisionporespecialidad() {
        System.out.println("3.1-->calcularcomisionporespecialidad");
        String especialidad = "Obstetricia";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 0;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
       
//costo especialidad mas comicion obstetricia
                @Test
          public void test3_calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("3 -> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Obstetricia";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 52.5;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
               @Test
          public void test3_1calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("3.1 --> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Obstetricia";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 50;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
       
 //costo de comicion Ginecologia
  @Test
    public void test4_calcularcomisionporespecialidad() {
        System.out.println("4-->calcularcomisionporespecialidad");
        String especialidad = "Ginecologia";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 5;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void test4_1calcularcomisionporespecialidad() {
        System.out.println("4.1-->calcularcomisionporespecialidad");
        String especialidad = "Ginecologia";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 0;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
                
//costo especialidad mas comicion Ginecologia
                @Test
            public void test4_calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("4 --> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Ginecologia";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 105;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
                  @Test
            public void test4_1calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("4.1 --> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Ginecologia";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 100;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
          
  //costo de comicion Ginecologia
  @Test
    public void test5_calcularcomisionporespecialidad() {
        System.out.println("5-->calcularcomisionporespecialidad");
        String especialidad = "Odontologia";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 5.5;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void test5_1calcularcomisionporespecialidad() {
        System.out.println("5.1-->calcularcomisionporespecialidad");
        String especialidad = "Odontologia";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 0;
        double result = instance.calcularcomisionporespecialidad(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
           
//costo especialidad mas comicion odontologia
                @Test
            public void test5_calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("5 --> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Odontologia";
        String tarjeta = "Si";
        Cita instance = new Cita();
        double expResult = 115.5;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
                @Test
            public void test5_1calcularElCostoDelTipoDeEspecialidadPorElTipoDePago() {
        System.out.println("5.1 --> calcular El Costo Del Tipo De Especialidad Por El tipo de pago");
        String especialidad = "Odontologia";
        String tarjeta = "No";
        Cita instance = new Cita();
        double expResult = 110;
        double result = instance.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, tarjeta);
        assertEquals(expResult, result, 0.0);
        
    }
            

}
