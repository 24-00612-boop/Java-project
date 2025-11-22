package Encapsulation;

public class Allowance extends Transaction {

    public Allowance(int id, String date, double amount, String description) {
        super(id, date, amount, description);
    }

    @Override
    public void apply(Student student) {
        student.updateBalance(getAmount());
    }
}
