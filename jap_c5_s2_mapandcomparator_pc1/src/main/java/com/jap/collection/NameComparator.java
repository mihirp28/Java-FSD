package com.jap.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Resident> {
    @Override
    public int compare(Resident o1, Resident o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
