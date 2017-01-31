package com.achir.M13IR.PO.Serie0;

import java.math.BigInteger;

/**
 * Created by achir on 31/01/2017.
 */
public class MainSerie0 {
    public static void main(String[] args) {
        Factorielle fact = new Factorielle();
        System.out.println("Factorielle de 10 = " + fact.factorielle(12));
        BigInteger v = new BigInteger(String.valueOf(13));
        System.out.println("Factorielle de " + v + " = " + fact.factorielle(v));
    }
}
