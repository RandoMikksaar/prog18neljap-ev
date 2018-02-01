package algus;

import java.util.Arrays;

public class Massiivid {
    
    public static int[] piirid(int[] arvud){
        int[] vastus=new int[2];
        
        return vastus;
    }
    
        public static int summa(int[] arvud){
            int summa=0;
            for(int i=0; i<arvud.length; i++){
                summa+=arvud[i];
            }
            return summa;
        }
    
    public static double keskmine(int[] arvud){
        return summa(arvud)*1.0/arvud.length;
    }
    
    
    public static void main(String[] arg){
        int[] pikkused={176, 162, 158, 171, 169};
        int[] t=piirid(pikkused);
        
        System.out.println(summa(pikkused));
        System.out.println(keskmine(pikkused));
        System.out.println("kokku: "+pikkused.length);
        System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
        for(int i=0; i<pikkused.length; i++){
            System.out.println(pikkused[i]);
        }
        //arvuta pikkuste summa
        int summa=0;
        for(int i=0; i<pikkused.length; i++){
            summa+=pikkused[i];
        }
        System.out.println(summa);
        summa=0;
        for(int pikkus: pikkused){summa+=pikkus;}
        System.out.println(summa);
        System.out.println(Arrays.stream(pikkused).sum());
        
    }
}
