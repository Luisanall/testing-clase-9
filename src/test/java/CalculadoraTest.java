import junit.framework.TestCase;
import org.example.Calculadora;

public class CalculadoraTest extends TestCase {
     public void testsumar(){
        assertTrue ( 2750.0 != Calculadora.sumar ( 70,40 ) * Calculadora.numero ( 25 ) );
         assertTrue ( 2700.0!= Calculadora.sumar ( 70,40 ) * Calculadora.numero ( 25) );


}
    public void testrestar(){
         assertEquals ( 605, Calculadora.restar ( 90,50 ) * Calculadora.numero ( 15 ));

    }



    public void testmultilicar(){
         assertEquals ( 240.0, Calculadora.multiplicar (80,3) );
         assertEquals ( 250.0, Calculadora.multiplicar ( 80,3 ) );

    }
    public void testdividir(){
        assertEquals ( 110.0, Calculadora.sumar ( 150,180 ) / Calculadora.numero ( 3 ) );
        assertEquals ( 113.0, Calculadora.sumar ( 150,180 ) / Calculadora.numero ( 3 ) );

    }
}
