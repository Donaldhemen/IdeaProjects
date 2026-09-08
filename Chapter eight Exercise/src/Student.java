enum StudentStatus {
    ACTIVE,
    INACTIVE,
    GRADUATED
}

public class Student {

    private String name;
    private int age;
    private StudentStatus status;

    // No-argument constructor
    Student() {
        this("Unknown", 0);
    }

    // Constructor with one argument
    Student(String name) {
        this(name, 0);
    }

    // Main constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.status = StudentStatus.ACTIVE;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.age = age;
    }
}
