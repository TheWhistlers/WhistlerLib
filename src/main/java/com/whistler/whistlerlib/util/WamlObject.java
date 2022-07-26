package com.whistler.whistlerlib.util;

import java.util.ArrayList;

public class WamlObject extends AbstractObject{
    private ArrayList<String> storedStatements = new ArrayList<String>();
    private boolean isNull;

    public static final WamlObject NULL = new WamlObject().setNull(true);

    public WamlObject() {
    }

    public WamlObject(ArrayList<String> storedStatements) {
        this.storedStatements = storedStatements;
    }

    public ArrayList<String> getStoredStatements() {
        return storedStatements;
    }

    public void setStoredStatements(ArrayList<String> storedStatements) {
        this.storedStatements = storedStatements;
    }

    private WamlObject setNull(boolean isNull) {
        this.isNull = isNull;
        return this;
    }

    public void addStatement(String statement) {
        this.storedStatements.add(statement);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "WamlObject{" + "storedStatements=" + storedStatements + '}';
    }

    public void print() {
        for (String statement : this.storedStatements) {
            System.out.println(statement);
        }
    }
}
