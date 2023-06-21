public class Manager extends Employee {
    private String deptName;

   public Manager(String name, String niNum, int salary, String deptName){
       super(name, niNum, salary);
       this.deptName = deptName;
   }

    public String getDeptName() {
       return this.deptName;
    }
}
