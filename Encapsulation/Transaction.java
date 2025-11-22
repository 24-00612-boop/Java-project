package Encapsulation;

public abstract class Transaction {

    private int id;
    private String date;
    private double amount;
    private String description;

    public Transaction(int id, String date, double amount, String description) {

        // Validate ID
        if (id <= 0) {
            throw new IllegalArgumentException("Transaction ID must be positive.");
        }
        this.id = id;

        // Validate date 
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException("Date cannot be empty.");
        }
        this.date = date;

        // Validate amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        this.amount = amount;

        // Validate description
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty.");
        }
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        this.amount = amount;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty.");
        }
        this.description = description;
    }

    public abstract void apply(Student student);

    @Override
    public String toString() {
        return "[ID: " + id + "] " + date + " | " +
               getClass().getSimpleName() + " | " +
               amount + " PHP | " +
               description;
    }
}
