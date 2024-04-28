package org.example;

class BoundedPriorityQueue extends LinkedList<Appointment> {
    private int maxSize;
    private String doctorFullName;

    public BoundedPriorityQueue(int maxSize, String doctorFullName) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size must be greater than 0");
        }
        this.maxSize = maxSize;
        this.doctorFullName = doctorFullName.toLowerCase();
    }

}