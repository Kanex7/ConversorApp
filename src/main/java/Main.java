import controller.ConexionAPI;
import controller.Convertir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Convertir conversor = new Convertir();
        Scanner inputUser = new Scanner(System.in);
        int opcionUser = 0;
        double valorUser = 0;
        while(true){
            System.out.println("""
           ====================================================
           ¡BIENVENIDO AL CONVERSOR DE MONEDAS!
           
           Seleccione la conversión que desea realizar:
           
           1)ARS ==> USD    (Pesos Argentinos a Dolares) 
           2)ARS ==> CLP    (Pesos Argentinos a Pesos Chilenos)
           3)USD ==> ARS    (Dolares a Pesos Argentinos)
           4)USD ==> CLP    (Dolares a Pesos Chilenos)
           5)CLP ==> USD    (Pesos Chilenos a Dolares)
           6)CLP ==> ARS    (Pesos Chilenos a Pesos Argentinos)
           7)SALIR
            """);

            try{
                opcionUser = Integer.parseInt(inputUser.nextLine());

                if (opcionUser == 7){
                    break;
                }
                if (7 < opcionUser || opcionUser < 1){
                    throw new NumberFormatException();
                }

                while(true){
                    System.out.println("\nIngrese el valor a convertir\n");
                    try{
                        valorUser = Double.parseDouble(inputUser.nextLine());

                        if (valorUser < 0){
                            throw new NumberFormatException();
                        }

                        System.out.println(STR."\nRESULTADO: $\{conversor
                                .ConvertirMoneda(opcionUser, valorUser)}\n");
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("\n¡¡Solo ingresar valores decimales positivos !!\n");
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("\n¡¡Solo ingresar valores enteros del 1-7!!\n");
            }
        }
    }
}