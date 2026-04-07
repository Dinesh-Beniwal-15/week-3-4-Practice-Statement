import java.util.*;

class Transaction {
    String id;
    double fee;
    String time;

    Transaction(String id, double fee, String time) {
        this.id = id;
        this.fee = fee;
        this.time = time;
    }

    public String toString() {
        return id + ":" + fee;
    }
}

public class Problem1 {
    public static void main(String[] args) {

        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("id1", 10.5, "10:00"));
        list.add(new Transaction("id2", 25.0, "09:30"));
        list.add(new Transaction("id3", 5.0, "10:15"));

        // Bubble Sort (by fee)
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }

        System.out.println("Bubble Sort: " + list);

        // Outliers
        System.out.println("High fee >50:");
        for (Transaction t : list) {
            if (t.fee > 50) System.out.println(t);
        }
    }
}