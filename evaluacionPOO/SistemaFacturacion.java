import java.util.ArrayList;
import java.util.List;

public class SistemaFacturacion {
    public static void main(String[] args) {
        List<Servicio> servicios = new ArrayList<>();
        System.out.println("\n");

        /* Internet con exceso de datos (550 GB > 400 GB)*/
        servicios.add(new ServicioInternet(
                "INT1",
                "Jorge Barrios",
                550.0,
                30.0,
                400.0,
                0.50
        ));
        

        /* Internet dentro del límite */
        servicios.add(new ServicioInternet(
                "INT2",
                "Sofía Panato",
                250.0,
                25.0,
                300.0,
                0.40
        ));
        

        /* Electricidad residencial con 10% descuento */ 
        servicios.add(new ServicioElectricidad(
                "ELEC1",
                "FERNANDO ZANABRIA",
                180.0,
                10.0,
                0.15,
                5.0,
                "RESIDENCIAL"
        ));

        /* Electricidad categoría COMERCIAL (15% recargo) */
        servicios.add(new ServicioElectricidad(
                "ELEC2",
                "Comercial El Llano",
                620.0,
                20.0,
                0.18,
                12.0,
                "COMERCIAL"
        ));

        double recaudoTotal = 0.0;

        for (Servicio servicio : servicios) {
            servicio.mostrarResumen();
            recaudoTotal += servicio.calcularTotalPagar();
        }

        
        System.out.println(" RECAUDO TOTAL DE TODOS LOS SERVICIOS: $" +(recaudoTotal));
    
    }
}