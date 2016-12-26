package com.achir.M13IR.PO.Serie2;

import com.achir.M13IR.PO.Serie1.Marin;

import java.util.Arrays;

/**
 * Created by achir on 18/11/2016.
 */
public class Equipage {

    private int marinsSize;
    private Marin  marins [];

    /**
     *
     */
    public Equipage () {
        this.marinsSize = 5;
        this.marins = new Marin[marinsSize];
    }

    /**
     *
     * @return
     */
    public int getCapacite() {
        return this.marins.length;
    }

    /**
     *
     * @return
     */
    public int getNombreMarins() {
        int ret = 0;

        for (int i = 0 ; i < this.marins.length ; i++) {
            if (this.marins[i] != null)
                ret++;
        }

        return ret;
    }

    /**
     *
     * @param marin
     * @return
     */
    public boolean addMarin(Marin marin) {

        if (this.getNombreMarins() == this.marins.length)
            return false;

        for (int i = 0 ; i < marinsSize ; i++) {
            if  (this.marins[i] == null) {
                this.marins[i] = marin;
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param marin
     * @return
     */
    public boolean isMarinPresent(Marin marin) {

        for (int i = 0 ; i < this.getCapacite() ; i++) {
            if ((this.marins[i] != null) && (this.marins[i].equals(marin)))
                return true;
        }

        return false;
    }

    /**
     *
     * @param marin
     * @return
     */
    public boolean removeMarin(Marin marin) {

        if (! this.isMarinPresent(marin))
            return false;

        for (int i = 0 ; i < this.getCapacite() ; i++) {
            if ((this.marins[i] != null) && (this.marins[i].equals(marin))) {
                this.marins[i] = null;
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @return
     */
    public Marin [] getEquipage() {

        Marin [] ret = new Marin[getNombreMarins()];

        int j = 0;

        for (int i = 0 ; i < this.marins.length ; i++) {
            if (marins[i] != null) {
                ret[j] = marins[i];
                j++;
            }
        }

        return ret;
    }

    /**
     *
     */
    public void clear() {

        for (int i = 0 ; i < this.marins.length ; i++)
            this.marins[i] = null;
    }


    /**
     *
     * @param equipage
     * @return
     */
    public boolean addAllEquipage(Equipage equipage) {

        if (equipage.getNombreMarins() + this.getNombreMarins() > this.getCapacite())
            return false;

        for (int i = 0 ; i < equipage.getCapacite() ; i++) {
            this.addMarin(equipage.marins[i]);
        }

        return true;
    }

    /**
     *
     * @param size
     */
    public void etendEquipage(int size) {

        this.marinsSize = this.marinsSize + size;

        Marin [] tmp_marins = new Marin[marinsSize];

        for (int i = 0 ; i < this.marins.length ; i++) {
            tmp_marins[i] = marins[i];
        }

        marins = tmp_marins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Equipage)) return false;

        Equipage equipage = (Equipage) o;

        if (marinsSize != equipage.marinsSize) return false;

        for (int i = 0 ; i < equipage.marins.length ; i++) {
            if (!this.isMarinPresent(equipage.marins[i])) {
                return false ;
            }
        }

        return true ;

    }

    @Override
    public int hashCode() {
        int result = marinsSize;
        result = 31 * result + Arrays.hashCode(marins);
        return result;
    }

    @Override
    public String toString() {
        return "Equipage{" +
                "marinsSize=" + marinsSize +
                ", marins=" + Arrays.toString(marins) +
                '}';
    }


}
