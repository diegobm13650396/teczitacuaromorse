/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Morse {
    
    private static MorseFunciones  mf;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean op=true;
        mf=new MorseFunciones();
        System.out.println ("\n Selecciona una opcion: \n 1.-Morse a texto \n 2.- Texto a morse \n 3.- Salir ");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
       
        while(op){
            entradaTeclado = entradaEscaner.nextLine ();
            switch(entradaTeclado){
                case "1":
                    System.err.println("Ingresa El codigo Morse: \n");
                    entradaTeclado = entradaEscaner.nextLine ();
                    System.err.println("EL texto es: "+mf.getMorseTexto(entradaTeclado));
                    break;
                case "2":
                    System.err.println("Ingresa el texto a convertir: \n");
                    entradaTeclado = entradaEscaner.nextLine();
                    System.err.println("El Codigo morse es: "+mf.getTextoMorese(entradaTeclado.toUpperCase()));
                    break;
                case "3":
                    System.err.println("Adios :)");
                    op=false;
                    break;
                default :
                    System.err.println("La opcion no existe ): \n");


            }
        }
       
    }
    
     public static class MorseFunciones{
        public final String [] listMorse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                                            ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
                                            "-..-","-.--","--..",
           
                                            ".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
   
        
        public final String [] listaAbc={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
                                           "W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};
        
        public MorseFunciones(){
            
        }
        
        public String getMorseTexto(String codMorse){
            String cod="";
            String result="";
            for(int i=0;i<=codMorse.length()-1;i++){
                if (codMorse.charAt(i)!=' ') {
                    cod+=codMorse.charAt(i)+"";
                }else{
                    //System.err.println(cod);
                    result+=""+getValorTexto(cod);
                    cod="";
                }
            }
            result+=""+getValorTexto(cod);
        return result;
        }
        
        public String getValorTexto(String cod){
           
            for(int i=0;i<=listMorse.length;i++){
                //System.err.println(listMorse[i]+"=="+cod+" ");
                if(listMorse[i].equals(cod)){
                    return listaAbc[i];
                }
            }
            return "";
        }
        
        
        
        public String getTextoMorese(String codTexto){
            String cod="";
            String result="";
            for(int i=0;i<=codTexto.length()-1;i++){
                
                if (codTexto.charAt(i)!=' ') {
                    result+=getValorMorse(codTexto.charAt(i)+"")+" ";
                   
                }
            }
        
        return result;
        }
        
        public String getValorMorse(String letra){
            for(int i=0;i<=listaAbc.length;i++){
                //System.err.println(listMorse[i]+"=="+cod+" ");
                if(listaAbc[i].equals(letra)){
                    return listMorse[i];
                }
            }
            return "";
        }
        
    }
    
    
}
