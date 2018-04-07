/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;


/* CLASE PRODUCTO */
public class Producto {
  private String NombreProducto;
  private String CodigoProducto;
  private double PrecioProducto;
}

/* CONSTRUCTOR PRODUCTO */
public Producto(String nombreProducto, String codigoProducto, double precioProducto){
  this.NombreProducto = nombreProducto;
  this.CodigoProducto = codigoProducto;
  this.PrecioProducto = precioProducto;
}

/* INSTANCIA PRODUCTO */
Producto produc = new Producto("Aceite Orisol","013HF51",4.35);

//GETTERS
public String getProducName (){
  return NombreProducto;
}

public String getProducCod (){
  return CodigoProducto;
}

public double getProducPrice (){
  return PrecioProducto;
}

//SETTERS
public void setProducName (){
  this.NombreProducto = NombreProducto;
}

public void setProducCod (){
  this.CodigoProducto = CodigoProducto;
}

public void setProducPrice (){
  this.PrecioProducto = PrecioProducto;
}

    
    

