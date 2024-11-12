/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author luk0s
 */
public class Persona {
    private Integer Rut, Edad;
    private String Nombre;

    public Persona() {
        Rut = 0;
        Edad = 0;
        Nombre = "";
    }

    public Persona(Integer Rut, Integer Edad, String Nombre) {
        this.Rut = Rut;
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public Integer getRut() {
        return Rut;
    }

    public void setRut(Integer Rut) {
        this.Rut = Rut;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "La Persona de rut (" + Rut + ") se llama: " + Nombre + " y tiene " + Edad + " años de edad.";
    }
    
    
}
