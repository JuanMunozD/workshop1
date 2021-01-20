package Solucion;
import java.util.Scanner;

public class Solucion {

    static int Caracteres = 256; 

    static boolean Anagrama(String a, String b) {
        String minusculasA = a.toLowerCase();
        String minusculasB = b.toLowerCase();

        char[] str1 = minusculasA.toCharArray();
        char[] str2 = minusculasB.toCharArray();

        int cont1[] = new int[Caracteres];  
        int cont2[] = new int[Caracteres];
        for(int c=0; c<Caracteres; c++){
            cont1[c] = 0;
            cont2[c] = 0;
        } 

        int i; 
        for (i = 0; i < str1.length && i < str2.length; i++) { 
            cont1[str1[i]]++; 
            cont2[str2[i]]++; 
        } 

        if (str1.length != str2.length) 
            return false; 

        for (i = 0; i < Caracteres; i++) 
            if (cont1[i] != cont2[i]) 
                return false; 
        return true; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = Anagrama(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}