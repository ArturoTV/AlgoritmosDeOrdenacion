/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenacion;

/**
 *
 * @author Arturo
 */
public class AlgoritmosDeOrdenacion {
    
    public void algoritmoBurbuja(int[] array){
        int cont;
        for(int j=1; j<array.length; j++){
            for(int i=0; i<array.length-j; i++){
                if(array[i] > array[i+1]){
                    cont = array[i];
                    array[i] = array[i+1];
                    array[i+1]= cont;
                }
            }
        }
        
        
        
    }
    
    public void algoritmoInserccion(int[] array){
         for (int i = 2; i < array.length; i++) {
             int aux = array[i];
             int j=0;
         for (j = i - 1; j >= 0 && array[j] > aux; j--) {
            array[j + 1] = array[j];
         }
            array[j + 1] = aux;
         }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {78,7,2,1,50,23};
        
        AlgoritmosDeOrdenacion ejercicios = new AlgoritmosDeOrdenacion();
        ejercicios.algoritmoInserccion(array);
        for(int f=0; f<array.length; f++){
            System.out.println(array[f]);
        }
        
    }
    
}
