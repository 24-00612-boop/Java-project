package Encapsulation;

public class Student {

    private String name;
    private double balance;

    public Student(String name) {

        // Validate name
        if (name == null || !name.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Name must contain only letters and cannot be empty.");
        }

        this.name = name.trim();
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || !name.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Invalid name. Names must contain letters only.");
        }

        this.name = name.trim();
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}
