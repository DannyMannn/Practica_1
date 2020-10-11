package com.TiendaDepartamental;

import java.util.Calendar;

public class AdministradorEstatal extends Administrador {
    private static int numAdminstradoresEstatales = 0;

    public AdministradorEstatal(String nombre,
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
        numAdminstradoresEstatales++;
    }


    public int getNumAdminstradoresEstatales(){
        return numAdminstradoresEstatales;
    }
    public static String[] obtenerMenu(){
         String[] menu = new String[] {
                "[1]Dar de alta a un empleado ordinario",
                "[2]Dar de alta a un operador",
                "[3]Eliminar un empleado ordinario",
                "[4]Eliminar un operador",
                "[5]Modificar a un empleado ordinario",
                "[6]Modificar a un operador",
                "[7]Ver datos de un empleado ordinario",
                "[8]Ver datos de un operador",
                "[9]Ver informe de un empleado ordinario",
                "[10]Ver informe de un operador",
                "[11]Cambiar tienda de un empleado ordinario",
                "[12]Cambiar tienda de un operador",
                "[13]Asignar vacaciones a un empleado ordinario",
                "[14]Asignar vacaciones a un operador"
        };
        return menu;
    }

    public String realizarOperacion(int operacionSeleccionada,Operador operador){
        switch(operacionSeleccionada){
            case 2:
                return this.darAltaEmpleado(operador);
            case 4:
                return this.eliminarEmpleado(operador);
            case 6:
                return this.modificarEmpleado(operador);
            case 8:
                return this.verDatosEmpleado(operador);
            case 10:
                return this.verInformeEmpleado(operador);
            case 12:
                return  this.cambiarTiendaEmpleado(operador);
            case 14:
                return this.asignarVacacionesEmpleado(operador);
            default:
                return "Operacion invalida";
        }
    }

    public String realizarOperacion(int operacionSelecionada, EmpleadoOrdinario empleadoOrdinario){
        switch(operacionSelecionada){
            case 1:
                return this.darAltaEmpleado(empleadoOrdinario);
            case 3:
                return this.eliminarEmpleado(empleadoOrdinario);
            case 5:
                return this.modificarEmpleado(empleadoOrdinario);
            case 7:
                return this.verDatosEmpleado(empleadoOrdinario);
            case 9:
                return this.verInformeEmpleado(empleadoOrdinario);
            case 11:
                return this.cambiarTiendaEmpleado(empleadoOrdinario);
            case 13:
                return this.asignarVacacionesEmpleado(empleadoOrdinario);
            default:
                return "Operacion Invalida";
        }
    }

    public String darAltaEmpleado(EmpleadoOrdinario empleado){
        return "El empleado se ha dado de alta.";
    }
    public String darAltaEmpleado(Operador empleado){
        return "El operador se ha dado de alta.";
    }

    public String eliminarEmpleado(EmpleadoOrdinario empleado){
        return "Se ha eliminado el empleado ordinario.";
    }
    public String eliminarEmpleado(Operador empleado){
        return "Se ha eliminado el operador.";
    }

    public String modificarEmpleado(EmpleadoOrdinario empleado){
        return "Empleado ordinario modificado.";
    }
    public String modificarEmpleado(Operador empleado){
        return "Operador modificado.";
    }

    public String verDatosEmpleado(EmpleadoOrdinario empleado){
        return "Datos del empleado ordinario...";
    }
    public String verDatosEmpleado(Operador empleado){
        return "Datos del operador...";
    }

    public String verInformeEmpleado(EmpleadoOrdinario empleado){
        return "Informe del empleado ordinario...";
    }
    public String verInformeEmpleado(Operador empleado){
        return "Informe del operador...";
    }

    public String cambiarTiendaEmpleado(EmpleadoOrdinario empleado){
        return "Se ha cambiado la tienda del empleado ordinario";
    }
    public String cambiarTiendaEmpleado(Operador empleado){
        return "Se ha cambiado la tienda del operador.";
    }

    public String asignarVacacionesEmpleado(EmpleadoOrdinario empleado){
        return "Vacaciones asignadas al empleado.";
    }
    public String asignarVacacionesEmpleado(Operador empleado){
        return "Vacaciones asignadas al operador.";
    }
}