package com.achir.M13IR.PO.Serie4;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by achir on 27/12/2016.
 */

public class NewEquipage {

    private Set<Marin> marins;

    /**
     *
     */
    public NewEquipage () {
        this.marins = new TreeSet<Marin>();
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
    public Set<Marin> getEquipage() {
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
    public boolean addAllEquipage(NewEquipage equipage) {
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
        if (!(o instanceof NewEquipage)) return false;
        NewEquipage equipage = (NewEquipage) o;
        return marins != null ? this.marins.containsAll(equipage.marins) : false;
    }

    @Override
    public int hashCode() {
        return marins != null ? marins.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Equipage{" +
                "marins=" + marins +
                '}';
    }
}
