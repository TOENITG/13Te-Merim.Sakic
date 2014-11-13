package bubblesort;

import java.util.*;
public class BubbleSort {
    
    /**Här använde jag Tobias Kod för att generera 100 slumpvalda siffror.**/
    static void PrintTheArray(int[] ArraytoPrint)
    {
        for(int i=0;i<100;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",ArraytoPrint[i]);
         }        
    }
 
    static int randomize(int maximum){ 
        return (int)(Math.random()*maximum) + 1;
    }
    /**Här deklarerar jag hur mitt program ska sortera värdena**/
    /**Ifall värdet till höger är mindre än jämförelsevärdet så flyttas Jämförelsetalet till höger.**/
    static int[] Bubblesort(int[] TheArray) {
        for(int a = 0; a<TheArray.length; a++){
            for(int i = 0; i<TheArray.length-1; i++) {
                if(TheArray[i]>TheArray[i+1]){
                    int Temp = TheArray[i+1];
                    TheArray[i+1] = TheArray[i];
                    TheArray[i] = Temp;
                }
            }
        }
        return TheArray;
    }
    
    public static void main(String[] args) {
      
        /**Här är vad som sker, allt ovan deklarerar vad som ska ske.**/
        int[] MyArray = new int[100];
        for(int i = 0; i<MyArray.length; i++){
            MyArray[i] = randomize(MyArray.length);
        }
        
        PrintTheArray(MyArray);
        MyArray = Bubblesort(MyArray);
        System.out.println("");
        PrintTheArray(MyArray);
    }
}

