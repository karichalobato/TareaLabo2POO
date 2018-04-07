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
/* CLASE PROVEEDOR */
public class Proveedor {
  private String NombreProveedor;
  private String ApellidoProveedor;
  private int TelefonoProveedor;
}

/* CONSTRUCTOR PROVEEDOR */
public Proveedor(String nombreProveedor, String apellidoProveedor, int telProveedor){
  this.NombreProveedor = nombreProveedor;
  this.ApellidoProveedo = apellidoProveedor;
  this.TelefonoProveedor = telProveedor;
}

/* INSTANCIA PROVEEDOR */
Proveedor proveedora = new Proveedor("Karicha","Lobato",75638793);

//GETTERS
public String getProviderName (){
  return NombreProveedor;
}

public String getProviderLastname (){
  return ApellidoProveedor;
}

public int getProviderPhone (){
  return TelefonoProveedor;
}



//SETTERS
public void setProviderName (){
  this.NombreProveedor = NombreProveedor;
}

public void setProviderLastname (){
  this.ApellidoProveedor = ApellidoProveedor;
}

public void setProviderPhone (){
  this.TelefonoProveedor = TelefonoProveedor;
}
