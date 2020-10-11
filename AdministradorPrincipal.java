package com.TiendaDepartamental;

import java.util.Calendar;

public class AdministradorPrincipal extends Administrador{
    private static int numAdminstradoresPrincipales = 0;

    public AdministradorPrincipal(String nombre,
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
        numAdminstradoresPrincipales++;
    }


    public int getNumAdminstradoresPrincipales(){
        return numAdminstradoresPrincipales;
    }
    public static String[] obtenerMenu(){
        String[] menu = new String[] {
                "[1]Dar de alta a un empleado.",
                "[2]Eliminar un empleado.",
                "[3]Modificar a un empleado.",
                "[4]Ver datos de un empleado.",
                "[5]Ver informe de un empleado.",
                "[6]Cambiar tienda de un empleado.",
                "[7]Asignar vacaciones a un empleado.",
        };
        return menu;
    }

    public String darAltaEmpleado(Empleado empleado){
        return "El empleado se ha dado de alta.";
    }

    public String eliminarEmpleado(Empleado empleado){
        return "Se ha eliminado el empleado.";
    }

    public String modificarEmpleado(Empleado empleado){
        return "Empleado modificado.";
    }

    public String verDatosEmpleado(Empleado empleado){
        return "Datos del empleado...";
    }

    public String verInformeEmpleado(Empleado empleado){
        return "Informe del empleado ordinario...";
    }

    public String cambiarTiendaEmpleado(Empleado empleado){
        return "Se ha cambiado la tienda del empleado.";
    }

    public String asignarVacacionesEmpleado(Empleado empleado){
        return "Vacaciones asignadas al empleado.";
    }

}
