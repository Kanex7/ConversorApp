package controller;

public class Convertir {
    ConexionAPI conexion = new ConexionAPI();
    String retorno = "";
    ConversionJSON convertorJSON = new ConversionJSON();

    public double ConvertirMoneda (int opcionUser, double valorUser){
        switch (opcionUser){

            case 1:
                retorno = conexion.conectarAPI("ARS","USD",valorUser);
                break;
            case 2:
                retorno = conexion.conectarAPI("ARS","CLP",valorUser);
                break;
            case 3:
                retorno = conexion.conectarAPI("USD","ARS",valorUser);
                break;
            case 4:
                retorno = conexion.conectarAPI("USD","CLP",valorUser);
                break;
            case 5:
                retorno = conexion.conectarAPI("CLP","USD",valorUser);
                break;
            case 6:
                retorno = conexion.conectarAPI("CLP","ARS",valorUser);
                break;
        }
        return convertorJSON.ConvertirDeJSON(retorno).conversion_result();
    }
}
