package com.TiendaDepartamental;

import java.nio.file.AccessDeniedException;
import java.util.Calendar;

public class Administrador extends Empleado {
    public String modificarInformacionPersonal(){
        return "Datos personales modificados";
    }
    public Administrador(String nombre,
                         String apellidos,
                         Calendar fechaNacimiento,
                         String genero,
                         String escolaridad,
                         String direccion,
                         float salario,
                         String puesto,
                         String telefono,
                         String nombreUsuario,
                         String constraseña,
                         Identificador id){
        super(nombre,
                apellidos,
                fechaNacimiento,
                genero,
                escolaridad,
                direccion,
                salario,
                puesto,
                telefono,
                nombreUsuario,
                constraseña,
                id);
    }

}
