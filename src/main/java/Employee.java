public abstract class Employee {

    private String name;
    private String niNum;
    int salary;

    public Employee (String name, String niNum, int salary) {
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;

    }
        public String getName() {
            return this.name;
        }
        public void setName(String newName){
            if (!(newName == null)) {
                this.name = newName;
            }

        }
        public String getNINum(){
            return this.niNum;
        }

        public int getSalary(){
            return this.salary;
        }

        public void raiseSalary(Double raiseAmount) {
            if (raiseAmount > 0) {
                this.salary += raiseAmount;
            }
        }

        public void payBonus() {
            this.salary *= 1.01;
        }










    }



