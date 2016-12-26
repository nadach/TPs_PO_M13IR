/**
 * PACKAGE
 */
package com.achir.M13IR.PO.Serie3;

/**
 * IMPORTS
 */

import com.achir.M13IR.PO.Serie1.Marin;
import com.achir.M13IR.PO.Serie3.util.Grade;

/**
 * CLASS
 */
public class Capitaine extends Marin {


    private Grade grade;

    /**
     *
     * @param nom : nom du Capitaine
     * @param prenom : prenom du Capitaine
     * @param grade : grade du Capitaine
     */
    public Capitaine(String nom, String prenom, Grade grade) {
        super(nom, prenom);
        this.grade = grade;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Capitaine{" +
                "grade=" + grade +
                "} " + super.toString();
    }

    /**
     *
     * @param o Object
     * @return true/false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Capitaine)) return false;
        if (!super.equals(o)) return false;

        Capitaine capitaine = (Capitaine) o;

        if (grade != capitaine.grade) return false;

        return true;
    }

    /**
     *
     * @return return the hashcode of the object
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
