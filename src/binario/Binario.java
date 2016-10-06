/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

/**
 *
 * @author alvaro
 */
import java.io.*;
public class Binario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos las variables
        String numBin;
        int decimal = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        //El try y el catch se utilizan para capturar el error al perdir un dato de entrada
        try{
            //Se pide un valor al usuario
            numBin = pedirNumero();
            //Bucle que itera sobre el String
            for (int i=0; i<numBin.length(); i++){
                //Convierte el un valor del String en entero
                int num = Integer.parseInt("" + numBin.charAt(i));
                //Control de errores
                if (num!=0 && num!=1 || numBin.length()!=3){
                    System.out.println("ERROR, Tiene que introducir 3 numeros binarios");
                    return;
                }
                //Convierte a Decimal
                if (i == 0){
                    decimal = decimal + 2*2*num;

                }else if(i == 1){
                    decimal = decimal + 2*num;

                }else if(i == 2){
                    decimal = decimal + num;

                }
                
            }
            //Muestra por pantalla el resultado.
            System.out.println("El numero introducido " + numBin + " en decimal es " + decimal);

        }catch(Exception e){
            System.out.println("Se ha producido un error.\nSe ha introducido una letra");
        }
        
        
    }
    //Funcion que pide un numero al usuario
    public static String pedirNumero()throws IOException {
        BufferedReader sb = new BufferedReader (
        new InputStreamReader(System.in));
        String cadena=sb.readLine();
        return cadena;
    }
    
}
