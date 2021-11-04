import java.util.Scanner;
/**
 * PRUEBAS CLASES DIMENSION Y PAQUETE
 * 
 * @Iñigo Camarero
 * 1.0
 */
public class TestEnvio
{
    /**
     * MAIN
     */
    public static void main(String [] args){
        Paquete paquetel = new Paquete();
        Paquete paquete2 = new Paquete(40, 69, 40);
        Envio envio = new Envio();
        envio.addPaquete(paquetel);
        envio.addPaquete(paquete2);
        System.out.println(envio.toString());
        System.out.println("--------------------------------------");
        Paquete paquete3 = new Paquete (new Dimension(50,50,70),13);
        envio.addPaquete(paquete3);
        System.out.println(envio.toString());
        System.out.println("--------------------------------------");
        envio.addPaquete(paquete2.obtenerCopia());
    }

}
