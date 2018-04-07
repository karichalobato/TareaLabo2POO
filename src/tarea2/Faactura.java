/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author CARLOS
 */
public class Factura {
  private String NombreProducto;
  private int CantidadProducto;
  private double PrecioProducto;
}

/* CONSTRUCTOR FACTURA */
public Factura(String nombreProducto,int cantidadProducto, double precioProducto){
  this.NombreProducto = nombreProducto;
  this.CantidadProducto = cantidadProducto;
  this.PrecioProducto = precioProducto;
}

/* INSTANCIA FACTURA */
Factura fact = new Factura("Aceite Orisol",25,4.35);

//GETTERS
public String getProductName (){
  return NombreProducto;
}

public int getCantProduct (){
  return CantidadProducto;
}

public double getPriceProduct (){
  return PrecioProducto;
}

//SETTERS
public void setProductName (){
  this.NombreProducto = NombreProducto;
}

public void setCantProduct (){
  this.CantidadProducto = CantidadProducto;
}

public void setPriceProduct (){
  this.PrecioProducto = PrecioProducto;
}

