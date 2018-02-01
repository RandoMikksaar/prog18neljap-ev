/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 * Esimene katsetus, muutujad, valik, massiv
 */
    


     /**
      * Arbamus ilma kohta
      * @author if17
      */
    public class Algus {
        public static void ilmaKommentaar(int temperatuur){
            if(temperatuur>0){System.out.println("Sulab");}
            else{System.out.println("Jäätab");}
        }
    
    /**
     * Alamprogramm toa soojuse hindamiseks vastavalt temperatuurile.
     * vähemalt kolm taset
     */
         public static void toaSoojus(int soojus){
            if(soojus>=25){System.out.println("Liiga soe");}
                else if(soojus<18){System.out.println("Liiga külm");}
                    else{System.out.println("Hea Temperatuur");}
        }
    /**
     * Programmi töö alguskoht
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Web!");
        ilmaKommentaar(3);
        toaSoojus(25);
    }
    
}
