/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.de.cesar;

import java.util.Scanner;

/**
 * @srgab
 * @author Alejandra
 */
public class CifradoDeCesar{

    /**
     * @param args the command line arguments
     */
        String frase1,frase2,frase3;
        int desplazamiento;
        String min = "abcdefghijklmnopqrstuvwxyz ";
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
       
    /**
     *
     */
    public void  ingresoDatosC(){
           
       
         Scanner S=new Scanner (System.in);
        
         
        frase2="";
       
        
       
        System.out.println("Digite la linea que desea cifrar o decifrar");
        frase1=S.nextLine();
        System.out.println(frase1);
        System.out.println("Introduce la clave ");
        desplazamiento=S.nextInt();
    
    }

    /**
     *
     */
    public void  ingresoDatosD(){
           
       
         Scanner S=new Scanner (System.in);
        
         
        frase3="";
       
        
       
        System.out.println("Digite la linea que desea cifrar o decifrar");
        frase2=S.nextLine();
        System.out.println(frase2);
        System.out.println("Introduce la clave ");
        desplazamiento=S.nextInt();
    
    }

    /**
     *
     */
    public void cifrado(){
        for(int i=0;i<frase1.length(); i++){
            for(int j =0;j<min.length();j++){
                if (frase1.charAt(i)==min.charAt(j)){
                    if(j+desplazamiento>=min.length()){
                        frase2+=min.charAt((j+desplazamiento)% min.length());
          
                    }else{
                        frase2 += min.charAt(j+ desplazamiento);
                    }
                }
                else if(frase1.charAt(i)==may.charAt(j)){
                    if(j+desplazamiento>=may.length()){
                        frase2+=may.charAt((j+desplazamiento)% may.length());
          
                    }else{
                        frase2 += may.charAt(j+ desplazamiento);
                    }
                
            }
    
        }
    
}
        System.out.println(frase1);
        System.out.println(frase2);
     }

    /**
     *
     */
    /*public void decifrado(){
        for(int i=0;i<frase2.length(); i++){
            for(int j =min.length();j>=0;j++){
                if (frase2.charAt(i)!=min.charAt(j)){
                    if(j-desplazamiento>=min.length()){
                        frase3+=min.charAt((j-desplazamiento)% min.length());
          
                    }else{
                        frase3 += min.charAt(j- desplazamiento);
                    }
                }
                else if(frase2.charAt(i)!=may.charAt(j)){
                    if(j-desplazamiento>=may.length()){
                        frase3+=may.charAt((j-desplazamiento)% may.length());
          
                    }else{
                        frase3 += may.charAt(j- desplazamiento);
                    }
                
            }
    
        }
    
}
        System.out.println(frase2);
        System.out.println(frase3);
     }*/
   
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
         Scanner numero=new Scanner (System.in);
        int num;
        // TODO code application logic here
        CifradoDeCesar datos= new  CifradoDeCesar();
        System.out.println("Que desea realizar\n");
        System.out.println("Si es cifrado.Digite el numero 1\n");
        System.out.println("Si es decifrado.Digite el numero 2 \n");
        num=numero.nextInt();
         
        if (num==1){
          datos.ingresoDatosC(); 
          datos.cifrado();  
        }else if(num==2){

        datos.ingresoDatosD(); 
           //datos.decifrado();
           
        }
       
        
       
    }   
}
