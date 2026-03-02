package Bai6;

import java.util.LinkedList;
import java.util.Queue;

class Patient3 {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient3(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Gender: " + gender;
    }
}

class PatientWaitingQueue {
    private Queue<Patient3> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient3 p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient3 callNextPatient() {
        if (waitingQueue.isEmpty()) return null;
        totalPatients--;
        return waitingQueue.poll();
    }

    public void displayQueue() {
        System.out.println("=== Danh sách bệnh nhân chờ khám ===");
        for (Patient3 p : waitingQueue) {
            System.out.println(p);
        }
    }
}
