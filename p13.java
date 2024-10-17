class employees {
    public static void main(String[] args) {

        employees e1=new employees("hardik","thummar",100);
        employees e2=new employees("hitanshu","prajapati",300);

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());

        System.out.println(e1.increasebyten(e1));


    }
    String name,lastname;
    double salary;

    public employees(String name, String lastname, double salary) {
        if(salary<0.0) {
            this.salary=0.0;
        }else{
            
        this.salary = salary;
        }
        this.name = name;
        this.lastname = lastname;
    }

    double increasebyten(employees e){
        double temp=e.getSalary()/10;
        return e.getSalary()+temp;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0) {
            this.salary=0.0;
        }
        this.salary = salary;
    }


}