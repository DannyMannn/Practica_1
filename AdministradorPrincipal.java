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

    public String realizarOperacion(int OperacionSelecionada, Empleado e){
        switch(OperacionSelecionada){
            case 1:
                return darAltaEmpleado(e);
            case 2:
                return eliminarEmpleado(e);
            case 3:
                return modificarEmpleado(e);
            case 4:
                return verDatosEmpleado(e);
            case 5:
                return verInformeEmpleado(e);
            case 6:
                return cambiarTiendaEmpleado(e);
            case 7:
                return asignarVacacionesEmpleado(e);
            default:
                return "Operacion Invalida";
        }
    }

    public int getNumAdminstradoresPrincipales(){
        return numAdminstradoresPrincipales;
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
