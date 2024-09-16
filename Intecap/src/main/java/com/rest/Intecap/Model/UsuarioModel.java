package com.rest.Intecap.Model;

public class UsuarioModel {
    String nombre;
    String Direccion;
    int edad;

    public UsuarioModel(){}

    public UsuarioModel(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        Direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
