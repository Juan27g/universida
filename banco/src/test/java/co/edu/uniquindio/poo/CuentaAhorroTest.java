/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CuentaAhorroTest {
    private static final Logger LOG = Logger.getLogger(CuentaAhorroTest.class.getName());


    @Test
    public void retirarDineroCuentaAhorro() {
        LOG.info("Iniciado test para retirar dinero desde una cuenta de ahorros.");
        CuentaAhorro cuentaAhorro= new CuentaAhorro(2777077, 50000, true, new Titular("Juan", "Herrera"), 2.7);
        cuentaAhorro.retirar(30000);
        assertEquals(20000, cuentaAhorro.getSaldo());
        LOG.info("Finalizando test para retirar dinero desde una cuenta de ahorros.");
    }

    @Test
    public void depositarDineroCuentaAhorro() {
        LOG.info("Iniciado test para depositar dinero a una cuenta de ahorros.");
        CuentaAhorro cuentaAhorro= new CuentaAhorro(2777077, 50000, true, new Titular("Juan", "Herrera"), 2.7);
        cuentaAhorro.depositar(50000);
        assertEquals(100000, cuentaAhorro.getSaldo());
        LOG.info("Finalizando test para depositar dinero a una cuenta de ahorros.");
    }

    @Test
    public void consultarSaldo() {
        LOG.info("Iniciado test para consultar saldo de una cuenta de ahorros.");
        CuentaAhorro cuentaAhorro= new CuentaAhorro(2777077, 50000, true, new Titular("Juan", "Herrera"), 2.7);
        assertEquals(50000, cuentaAhorro.consultarSaldo());
        LOG.info("Finalizando test para consultar saldo de una cuenta de ahorros.");
    }  
    @Test
    public void transferirDinero() {
        LOG.info("Iniciado test para transferir dinero de una cuenta a otra.");
        CuentaAhorro cuentaAhorro1= new CuentaAhorro(2777077, 50000, true, new Titular("Juan", "Herrera"), 2.7);
        CuentaAhorro cuentaAhorro2= new CuentaAhorro(1009536, 200000, true, new Titular("Gerald", "londono"), 7.2);

        cuentaAhorro2.transferir(100000, cuentaAhorro1);
        assertEquals(150000, cuentaAhorro1.getSaldo());
        assertEquals(100000, cuentaAhorro2.getSaldo());
        LOG.info("Finalizando test para transferir dinero de una cuenta a otra.");
    }

    @Test
    public void cuentaExiste() {
        LOG.info("Iniciado test para retirar dinero desde una cuenta de ahorros.");
        CuentaAhorro cuentaAhorro= new CuentaAhorro(2777077, 50000, true, new Titular("Juan", "Herrera"), 2.7);
        cuentaAhorro.verificarExistenciaCuenta(2777077);
        LOG.info("Finalizando test para retirar dinero desde una cuenta de ahorros.");
    }

}
