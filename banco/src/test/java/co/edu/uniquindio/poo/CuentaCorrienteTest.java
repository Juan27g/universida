package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    private static final Logger LOG = Logger.getLogger(CuentaCorriente.class.getName());
    

     @Test
    public void retirarDineroCuentaCorriente() {
        LOG.info("Iniciado test para retirar dinero desde una cuenta corriente.");
        CuentaCorriente cuentaCorriente= new CuentaCorriente(27770770, 50000, true, new Titular("Juan", "Herrera"), 100000);
        cuentaCorriente.retirar(35000);
        assertEquals(15000, cuentaCorriente.getSaldo());
        LOG.info("Finalizando test para retirar dinero desde una cuenta corriente.");
    }

    @Test
    public void retirarDineroCuentaCorrienteConSobregiro() {
        LOG.info("Iniciado test para retirar dinero desde una cuenta corriente usando el sobregiro.");
        CuentaCorriente cuentaCorriente= new CuentaCorriente(27770770, 50000, true, new Titular("Juan", "Herrera"), 100000);
        cuentaCorriente.retirar(150000);
        assertEquals(-100000, cuentaCorriente.getSaldo());
        assertEquals(0, cuentaCorriente.getSobreGiro());
        LOG.info("Finalizando test para retirar dinero desde una cuenta corriente usando el sobregiro.");
    }

    @Test
    public void depositarDineroCuentaCorriente() {
        LOG.info("Iniciado test para depositar dinero a una cuenta corriente.");
        CuentaCorriente cuentaCorriente= new CuentaCorriente(27770770, 50000, true, new Titular("Juan", "Herrera"), 100000);
        cuentaCorriente.depositar(40000);
        assertEquals(90000, cuentaCorriente.getSaldo());
        LOG.info("Finalizando test para depositar dinero a una cuenta corriente.");
    }


    @Test
    public void consultarSaldoCuentaCorriente() {
        LOG.info("Iniciado test para consultar el saldo una cuenta corriente.");
        CuentaCorriente cuentaCorriente= new CuentaCorriente(27770770, 50000, true, new Titular("Juan", "Herrera"), 100000);
        assertEquals(50000, cuentaCorriente.consultarSaldo());
        LOG.info("Finalizando test para consultar el saldo de una cuenta corriente.");
    }


    @Test
    public void transferirDinero() {
        LOG.info("Iniciado test para transferir dinero de una cuenta a otra.");
        CuentaCorriente cuentaCorriente1= new CuentaCorriente(2777077, 50000, true, new Titular("Juan", "Herrera"), 200000);
        CuentaCorriente cuentaCorriente2= new CuentaCorriente(1009536, 200000, true, new Titular("Gerald", "londono"), 100000);

        cuentaCorriente2.transferir(100000, cuentaCorriente1);
        assertEquals(150000, cuentaCorriente1.getSaldo());
        assertEquals(100000, cuentaCorriente2.getSaldo());
        LOG.info("Finalizando test para transferir dinero de una cuenta a otra.");
    }


}
