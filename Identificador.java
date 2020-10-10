package com.TiendaDepartamental;

public class Identificador{
    private  int ID;

    public Identificador(int id){
        this.ID = id;
    }

    public EnumTipoEmpleado obtenerTipoEmpleado() {
        final int combinacionesEmpleado = 3;
        int id = this.ID & combinacionesEmpleado;
        return EnumTipoEmpleado.getTipoEmpleadoPorId(id);
    }
    public boolean esEmpleadoActivo(){
        int desplazamiento = 1;
        if (((this.ID >> desplazamiento) & 2) == 0){
            return false;
        }
        return true;
    }

    public int obtenerNumeroSucursal(){
        int desplazamiento = 3;
        int sucursales = 127;
        return ((this.ID >> desplazamiento) & sucursales);
    }

    public EnumTipoSucursal obtenerTipoSucursal(){
        int desplazamiento = 10;
        int tiposSucursales = 3;
        int id = (this.ID >> desplazamiento) & tiposSucursales;
        return EnumTipoSucursal.getEnumTipoSucursalPorId(id);
    }

    public EnumEstado obtenerEstado(){
        int desplazamiento = 12;
        int estados = 31;
        int id = (this.ID >> desplazamiento) & estados;
        return EnumEstado.getEstadoPorId(id);
    }

    public boolean esTiendaActiva(){
        int desplazamiento = 17;
        if(((this.ID >> desplazamiento) & 1) == 0){
            return false;
        }
        return true;
    }
}