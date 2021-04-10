import Calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class TestCalculadora {


    @Test

    public void queSePuedaCrearUnaCalculadora(){

        //given(dado)
        Calculadora calculadoracassio=new Calculadora ();
        //when(cuando)
        Calculadora cassio=calculadoracassio;
        //then(entonces)
        Assert.assertNotNull(cassio);

    }
    @Test
    public void queLaCalculadoraUnaVezCreadaEsteApagada(){

        //given
        Calculadora cassio=new Calculadora();
        //when
        Boolean status;
                status = cassio.estado();
        //then
        Assert.assertFalse(status);

    }

    @Test
    public void queLaCalculadoraSePuedaPrender(){


        //given
        Calculadora cassio = new Calculadora();
        //when
        cassio.onOff();
        Boolean status;
                status=cassio.estado();
        //then
        Assert.assertTrue(status);

    }

    @Test
    public void queLaCalculadoraSume(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when
        cassio.operacion(1.0,'+',4.0);
        double result=cassio.display();
        //then
        Assert.assertEquals(5.0,result,0.1);
    }

    @Test
    public void queLaCalculadoraReste(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when
        cassio.operacion(1.0,'-',4.0);
        double result=cassio.display();
        //then
        Assert.assertEquals(-3.0,result,0.1);
    }

    @Test
    public void queLaCalculadoraMultiplique(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when

        cassio.operacion(1.0,'*',4.0);
        double result=cassio.display();
        //then
        Assert.assertEquals(4.0,result,0.1);
    }
    @Test
    public void queLaCalculadoraDivida(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when

        cassio.operacion(4.0,'/',2.0);
        double result=cassio.display();
        //then
        Assert.assertEquals(2.0,result,0.1);
    }


    @Test
    public void queLaCalculadoraPotencie(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when

        cassio.operacion(2.0,'^',5.0);
        double result=cassio.display();
        //then
        Assert.assertEquals(32,result,0.1);
    }

    @Test
    public void queLaCalculadoraPotencienegativa(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when

        cassio.operacion(2.0,'^',-4.0);
        double result=cassio.display();
        //then
        Assert.assertEquals(0.0625,result,0.1);
    }

    @Test
    public void queLaCalculadoraPotencieConMath(){
        //given
        Calculadora cassio = new Calculadora();
        cassio.onOff();
        //when

        cassio.operacion(4.0,'$');
        double result=cassio.display();
        //then
        Assert.assertEquals(2.0,result,0.1);
    }



}
