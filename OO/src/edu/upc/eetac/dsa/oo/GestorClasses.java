package edu.upc.eetac.dsa.oo;

import edu.upc.eetac.dsa.oo.figuras.Cercle;
import edu.upc.eetac.dsa.oo.figuras.Figura;
import edu.upc.eetac.dsa.oo.figuras.Quadrat;
import edu.upc.eetac.dsa.oo.figuras.Rectangle;


import java.util.Arrays;

public class GestorClasses {

    public static void sort (Figura[] v){
        Arrays.sort(v);
    }

    public static double suma (Figura[] v){
        double ret = 0;
        for (Figura f:v){
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v= new Figura[3];
        v[0] = new Quadrat(2);
        v[1]= new Rectangle(2,1);
        v[2]= new Cercle(5);

        double r = GestorClasses.suma(v);

        System.out.println(r);

        System.out.println(Arrays.asList(v));
        GestorClasses.sort(v);
        System.out.println(Arrays.asList(v));
    }
}
