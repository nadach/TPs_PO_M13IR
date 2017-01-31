package com.achir.M13IR.PO.Serie0;

import java.math.BigInteger;

/**
 * Created by achir on 31/01/2017.
 */
public class Factorielle {

    public int factorielle(int valeur) {
        int fact = 1;
        for(int i = 1; i <= valeur; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public BigInteger factorielle(BigInteger valeur) {

        BigInteger fact;
        fact = BigInteger.ONE;

        for(BigInteger i = BigInteger.ONE; i.compareTo(valeur.add(BigInteger.ONE))<0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        return fact;
    }

}
