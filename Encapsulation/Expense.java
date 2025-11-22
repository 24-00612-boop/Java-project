package Encapsulation;

public class Expense extends Transaction {

    public Expense(int id, String date, double amount, String description) {
        super(id, date, amount, description);
    }

    @Override
    public void apply(Student student) {
        student.updateBalance(-getAmount());
    }
}
