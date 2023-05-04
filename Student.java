public class Student {

    private static int count = 0; // unique users identifier counter
    private int id;
    private String name;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

