public class Employee {
    // Pola klasy (stan obiektu)
    private String name;
    private int skill;
    private double salary;

    // Konstruktor (tworzy nowego pracownika)
    public Employee(String name, int skill, double salary) {
        this.name = name;
        this.skill = skill;
        this.salary = salary;
    }

    // Metoda work (zachowanie obiektu)
    public int work() {
        return this.skill;
    }
    public String getName() {
        return name;
    }
    public int getSkill() {
        return skill;
    }
    public double getSalary() {
        return skill;
    }
}