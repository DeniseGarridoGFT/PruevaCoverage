package org.example.Persona;

public class Persona {
    private String nombre;
    private Integer saldo;

    public Persona(String nombre, Integer saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getSaldo() {
        return saldo;
    }
}
