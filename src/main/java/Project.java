import java.util.ArrayList;
import java.util.List;
 
public class Project {
    private String name;
    private int requiredWork;
    private int progress;
    private List<Employee> team;
 
    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.team = new ArrayList<>();
    }
 
    public void addEmployee(Employee employee) {
        this.team.add(employee);
    }
 
    public void workOneTurn() {
        // Każdy pracownik z listy team wykonuje pracę (metoda work())
        for (Employee employee : team) {
            this.progress += employee.work();
        }
 
        // Zabezpieczenie, żeby postęp nie przekroczył wymaganej pracy
        if (this.progress > this.requiredWork) {
            this.progress = this.requiredWork;
        }
    }
 
    public boolean isFinished() {
        return this.progress >= this.requiredWork;
    }
 
    // Gettery (potrzebne dla klasy Main, żeby mogła wypisać dane)
    public String getName() { return name; }
    public int getRequiredWork() { return requiredWork; }
    public int getProgress() { return progress; }
}