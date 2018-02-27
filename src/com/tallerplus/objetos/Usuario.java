package com.tallerplus.objetos;

public class Usuario {
    //tipo:admin,recepcion,mecanico.
    private String usuario,contrasena,tipo;

    public Usuario(String usuario, String contraseña, String tipo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "usuario:" + usuario + ", contraseña:" + contrasena + ", tipo:" + tipo;
    }
    
    
}
