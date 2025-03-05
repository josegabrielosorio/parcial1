import clases.Compra;

public class Main {

    public static void main(String[] args) {
        Compra parcial = new Compra();
        parcial.cliente = "Robert";
        parcial.producto = "yogur";
        parcial.precio = 5000;
        parcial.cantidad = 11;

        System.out.println("Estimado cliente "+ parcial.cliente + " usted compró "+parcial.producto);
        System.out.println("La cantidad fue "+parcial.cantidad+" con un precio de "+parcial.precio);


        System.out.println(parcial.calcular());
    }
}
