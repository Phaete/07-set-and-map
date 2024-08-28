package com.phaete;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications = new HashMap<>();

    public int getCount(Medication medication) {
        return medications.get(medication.getName()).getAvailability();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medications.getOrDefault(medicationName, null); // get would also return null if the key does not exist
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    public void printAll() {
        medications.forEach((key, value) -> System.out.println(key + " " + value));
        // System.out.println(medications.values());
    }
}
