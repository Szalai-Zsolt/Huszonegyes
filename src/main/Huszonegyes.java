
package main;

import java.util.Random;


public class Huszonegyes {

   private static int[] jatekosLapjai=new int[10];
   private static int[] gepLapjai=new int[10];
   private static Random rnd=new Random();
   
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        
        inicializalas();
        
    }

    private static void inicializalas() {
        kezdoAllapot();
        konzolraIr("Jatekos lapjai(%d, %d)".formatted(jatekosLapjai[0], jatekosLapjai[1]));
        konzolraIr("Gep lapjai(%d, %d)".formatted(gepLapjai[0], gepLapjai[1]));
        huzas();
    }

    private static int laphuzas() {
       int ertek=rnd.nextInt(2, 11);
       return ertek;
    }

    private static void kezdoAllapot() {
        for(int i=0; i<2; i++){
            jatekosLapjai[i]=laphuzas();
            gepLapjai[i]=laphuzas();
        }    
    }
    
    private static void huzas() {
        int kor=2;
        
        if(jatekosOsszeg()<15){
                jatekosLapjai[kor]=laphuzas();
        } else if (jatekosOsszeg()>21){
            konzolraIr("Jatekos vesztett");
        } else{
            konzolraIr("Kér?(I/N)");
        }
    
            
     }
     
    private static void konzolraIr(String kimenet) {
        System.out.println(kimenet);    
    }

    private static int jatekosOsszeg() {
        int osszeg = 0;
        for (int i = 0; i < jatekosLapjai.length; i++) {
            osszeg +=jatekosLapjai[i];
        }
        return osszeg;
    }

}
