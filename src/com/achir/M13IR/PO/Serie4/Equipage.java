package com.achir.M13IR.PO.Serie4;

/**
 * Created by achir on 27/12/2016.
 */

import com.achir.M13IR.PO.Serie1.Marin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by achir on 18/11/2016.
 */
public class Equipage {

    private List<Marin> marins;

    /**
     *
     */
    public Equipage () {
        this.marins = new ArrayList<Marin>();
    }

    /**
     *
     * @return
     */
    public int getCapacite() {
        return this.marins.size();
    }

    /**
     *
     * @return
     */
    public int getNombreMarins() {
        return this.marins.size();
    }

    /**
     *
     * @param marin
     * @return
     */
    public boolean addMarin(Marin marin) {
        return marins.add(marin);
    }

    /**
     *
     * @param marin
     * @return
     */
    public boolean isMarinPresent(Marin marin) {
        return marins.contains(marin);
    }

    /**
     *
     * @param marin
     * @return
     */
    public boolean removeMarin(Marin marin) {
        return marins.remove(marin);
    }

    /**
     *
     * @return
     */
    public List<Marin> getEquipage() {
        return marins;
    }

    /**
     *
     */
    public void clear() {
        marins.clear();
    }


    /**
     *
     * @param equipage
     * @return
     */
    public boolean addAllEquipage(Equipage equipage) {
        return marins.addAll(equipage.getEquipage());
    }

    /**
     *
     * @param size
     */
    public void etendEquipage(int size) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipage)) return false;

        Equipage equipage = (Equipage) o;

        return marins != null ? this.marins.containsAll(equipage.marins) : false;
    }

    @Override
    public int hashCode() {

        // Add compare method to be able to compare to Marin objects
        // and sort the marins list
        marins.sort(new Comparator<Marin>() {
            @Override
            public int compare(Marin o1, Marin o2) {
                if(o1.getNom().equals(o2.getNom())){
                    return o1.getPrenom().compareTo(o2.getPrenom());
                }
                else{
                    return o1.getNom().compareTo(o2.getNom());
                }
            }
        });

        // compute the hascode on sorted marins list
        return marins != null ? marins.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Equipage{" +
                "marins=" + marins +
                '}';
    }
}

