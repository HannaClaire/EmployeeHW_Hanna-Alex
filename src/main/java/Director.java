public class Director extends Manager{

    private double budget;
    public Director(String name, String niNum, int salary, String deptName, double budget){
        super(name, niNum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public void payBonus(){
        this.salary *= 1.02;
    }

}
