package packet;
public class TestInterfazPorPagar {

    public static void main(String[] args) {
        PorPagar [] objPorPagar = new PorPagar[5];

        objPorPagar[0] = new Factura("p01","",20,10.6);
        objPorPagar[1] = new Factura("p02","",5,23.8);
        objPorPagar[2] = new EmpleadoAsalariado("Jesus","Pizarro",9999,500);
        objPorPagar[3] = new EmpleadoAsalariado("Patty","Vasquez",8888,650);

        listar(objPorPagar);

        System.out.println();

    }
     public static void listar(PorPagar [] arr) {
         for(PorPagar e : arr) {
             if (e != null) {
                System.out.print(e);
                System.out.println("\tMonto a Pagar: "+e.obtenerMontoPago());
             }
         }

     }

}