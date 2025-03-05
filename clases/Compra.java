package clases;

public class Compra {
    public String cliente;
    public String producto;
    public int precio;
    public int cantidad;
    private double precioFinal;
    private double descuento;
    private double valor;

    public String calcular(){

        if(precio < 0){
            return "Debe elegir un precio mayor a 0";
        }

        if(cantidad < 0){
            return "Debe elegir una cantidad mayor a 0";
        }
        precioFinal = precio * cantidad;
        if(cantidad < 10){
            descuento = 0;
        } else if (cantidad >= 10 && cantidad < 20){
            descuento = precioFinal * 0.05;
        } else if (cantidad >= 20){
            descuento = precioFinal * 0.07;

        }else{
            return "Valor no válido";
        }
        valor = precioFinal;
        precioFinal = precioFinal - descuento;
        return "Su compra tiene un valor neto " + valor +" Su compra tiene un valor final de" + precioFinal;
    }
}
