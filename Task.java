import java.util.ArrayList;
import java.util.List;

public class Task {
    private static int idCounter = 0;
    private int id;
    private String title;
    private List<Integer> completedBy;

    public Task(String title) {
        this.id = ++idCounter;
        this.title = title;
        this.completedBy = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Integer> getCompletedBy() {
        return completedBy;
    }

    public void addCompletedBy(int id) {
        completedBy.add(id);
    }

    public String toString() {
        return "Task #" + id + ": " + title + " (completed by: " + completedBy.toString() + ")";
    }
}

